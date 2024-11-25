package multithreading_35_36.multithreading_3_5;

/**
 * 5.	Реализовать простую программу,
 * в которой используется паттерн Producer & Consumer с помощью очереди (wait, notify).
 */
public class Main {
    public static void main(String[] args) {
        Repository repository = new Repository();

        Thread producingThread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                repository.produce();
            }
        });
        Thread consumingThread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                repository.consume();
            }
        });

        producingThread.start();
        consumingThread.start();

        try {
            producingThread.join();
            consumingThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


