package multithreading_35_36.multithreading_1_5;

/**
 * 5.	Создать два потока, которые выводят числа на консоль.
 * Сделать так, чтобы сначала полностью выполнился первый поток,
 * потом полностью выполнился второй поток,
 * лишь затем завершил свое выполнение поток main.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[2];

        for (int i = 0; i < threads.length; i++) {
           threads[i] = new Thread(Main::printNumbers);
           threads[i].start();
           threads[i].join();
        }

        System.out.println("MAIN");
    }

    private static void printNumbers(){
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}


