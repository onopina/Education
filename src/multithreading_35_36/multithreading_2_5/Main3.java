package multithreading_35_36.multithreading_2_5;

/**
 * Способ 3 (Следующий поток стартует только после завершения работы предыдущего)
 */
public class Main3 {
    private static int num = 0;

    public static void main(String[] args) {
        Thread thread1 = new Thread(Main3::incrementNum);
        Thread thread2 = new Thread(Main3::incrementNum);
        Thread thread3 = new Thread(Main3::incrementNum);

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread3.start();
        try {
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
