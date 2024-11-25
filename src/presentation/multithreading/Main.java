package presentation.multithreading;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread.start();
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        myThread1.start();
        try {
            myThread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        myThread2.start();
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(myThread.getName());


//        Thread thread = new Thread(new MyRunnable());
//        thread.start();
//
//        Thread t = new Thread(() -> System.out.println("Lambda Runnable"));
//        t.start();
//
//        System.out.println("main");


    }
}
