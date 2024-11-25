package multithreading_35_36.multithreading_3_7;

public class Repository {
    String[] words;
    String[] result;

    public Repository(String message) {
        this.words = message.split(" ");
    }

    public String[] getWords() {
        return words;
    }

    public synchronized void produce(){
        result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            result[i] = words[i];
            System.out.println("The element " + result[i] + " has sent to the Consumer");
            notify();
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void consume(){
        for (int i = 0; i < words.length; i++) {
            if (result==null || result[i]==null){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println("The element " + result[i] + " has received from the Producer");
            notify();
        }
    }
}
