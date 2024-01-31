package multithreading.multithreading_1_3;

/**
 * 3.	Создать 5 потоков. Написать код, в котором должно сообщаться о том, что все потоки завершили свою работу.
 */
public class Main {
    public static void main(String[] args) {
        Thread[] threads = new Thread[5];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread();
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
                System.out.println(thread.getName() + " " + thread.getState());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
