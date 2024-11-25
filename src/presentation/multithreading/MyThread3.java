package presentation.multithreading;

public class MyThread3 extends Thread {
    private volatile boolean stop = false;

    @Override
    public void run() {
        int j = 0;
        while(!stop){
            if (j % 100_000_000 == 0){
                System.out.println("Iteration: " + j);
                j++;
            }
        }
    }

    public void stopThread(){
        this.stop = true;
    }

}
