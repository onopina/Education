package multithreading.multithreading_1_1;

/**
 * 1.	Создать новый поток тремя способами.
 */
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Thread thread = new Thread(new MyRunnable());
        thread.start();

        Thread t = new Thread(() -> System.out.println("This is a new lambda runnable thread"));
        t.start();
    }
}
