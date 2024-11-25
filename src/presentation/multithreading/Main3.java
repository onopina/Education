package presentation.multithreading;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        MyThread3 thread3 = new MyThread3();
        thread3.start();
        Thread.sleep(2000);

        new Thread(thread3::stopThread).start();

    }
}

