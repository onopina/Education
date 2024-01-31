package multithreading.multithreading_2_5;

/**
 * 5.	Дан статический метод и три потока.
 * Необходимо сделать так, чтобы каждый поток выполнял такой метод по очереди.
 * Решить задачу тремя способами.
 * Проверить на 5 потоках.
 */

/**
 * Способ 1 (synchronized метод)
 */
public class Main1 {
    private static int num = 0;

    public static void main(String[] args) {
        Thread thread1 = new Thread(Main1::incrementNum);
        Thread thread2 = new Thread(Main1::incrementNum);
        Thread thread3 = new Thread(Main1::incrementNum);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(num);

    }

    private synchronized static void incrementNum(){
        for (int i = 0; i < 100000; i++) {
            num++;
        }
    }
}
