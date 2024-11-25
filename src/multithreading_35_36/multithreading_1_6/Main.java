package multithreading_35_36.multithreading_1_6;

/**
 * 6.	Дано 10 потоков, выполняющих любую задачу.
 * Необходимо сделать так, чтобы поток main дождался выполнениях всех потоков.
 */
public class Main {
    public static void main(String[] args) {
        Thread[] threads = new Thread[10];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> System.out.println(Thread.currentThread().getName()));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
