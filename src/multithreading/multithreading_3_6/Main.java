package multithreading.multithreading_3_6;

/**
 * 6.	Реализовать программу из пункта 4, использующую блокирующую очередь.
 */
public class Main {
    public static void main(String[] args) {
        Repository repository = new Repository();

        Thread producingThread = new Thread(repository::produce);
        Thread consumingThread = new Thread(repository::consume);

        producingThread.start();
        consumingThread.start();
    }
}
