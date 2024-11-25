package presentation.multithreading;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("New runnable thread");
    }
}
