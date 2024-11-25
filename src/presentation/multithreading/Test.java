package presentation.multithreading;

public class Test {
    private char counter = 1;
    private int N = 10;

    public void printOddNumber(){
        synchronized (this){
            while (counter < N){
                while (counter%2 == 0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(counter + " ");
                counter++;
                notify();
            }
        }
    }

    public void printEvenNumber(){
        synchronized (this){
            while (counter<N){
                while (counter%2 != 0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(counter + " ");
                counter++;
                notify();
            }
        }
    }
}
