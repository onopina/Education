package multithreading.multithreading_2_2;

public class Counter {
    private int counter;
    private final int maxNumber = 100;

    public Counter(int counter) {
        this.counter = counter;
    }

    public synchronized void doCycle(){
        try {
            while (counter < maxNumber) {
                System.out.println(counter);
                wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void incrementCounter(){
        for (int i = 0; i < maxNumber; i++) {
            synchronized (this){
                counter++;
                notify();
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        }




}
