package multithreading_35_36.multithreading_2_8;

public class Alphabet {
    private char[] alphabet;
    private int i = 0;

    public Alphabet() {
        this.alphabet = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N'};
    }

    public void printOddLetters(){
        synchronized (this){
            while (i < alphabet.length-1) {

                if (i%2 == 0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(alphabet[i]);
                i++;
                notify();
            }
        }
    }

    public void printEvenLetters(){
        synchronized (this){
            while (i < alphabet.length-1) {

                if (i%2 != 0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(alphabet[i]);
                i++;
                notify();
            }
        }
    }
}
