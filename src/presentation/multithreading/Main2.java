package presentation.multithreading;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start();
//        Thread.sleep(500);
        thread.join();

        System.out.println("\nThread main");



    }
}
