package multithreading_35_36.multithreading_2_3.way_1;

/**
 * 3.	Дан обычный метод, который вызывается всегда на одном объекте.
 * Необходимо сделать так, чтобы метод мог одновременно выполняться только в одном потоке.
 * Решить задачу тремя способами. Проверить на 5 потоках.
 * Примечание: метод может выполняться одновременно во многих потоках,
 * если задействованы разные объекты (если метод вызывается на разных объектах).
 */
public class Main {
    public static void main(String[] args) {
        Number number = new Number(0);

        Thread[] threads = new Thread[5];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    number.incrementNum();
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(number.getNum());
    }
}
