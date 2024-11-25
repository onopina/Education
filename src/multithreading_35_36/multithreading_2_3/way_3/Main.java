package multithreading_35_36.multithreading_2_3.way_3;

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

        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(number.getNum());
    }
}
