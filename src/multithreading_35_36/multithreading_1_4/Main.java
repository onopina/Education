package multithreading_35_36.multithreading_1_4;

/**
 * 4.	Дано два потока. Они выводят на консоль числа от 0 до 100.
 * Прекратить вывод чисел после того, как main завершит работу.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(Main::printNumbers);
        Thread thread2 = new Thread(Main::printNumbers);

        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();

        Thread.sleep(1);
        System.out.println("MAIN");
    }

    public static void printNumbers(){
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
