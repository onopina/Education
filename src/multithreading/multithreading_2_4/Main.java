package multithreading.multithreading_2_4;

/**
 * 4.	Решить задачу из пункта 3 любым способом (одним) так,
 * чтобы при вызове метода на разных объектах (или на одном и том же),
 * он выполнялся одновременно только в одном потоке. Остальные должны ждать.
 */
public class Main {
    public static void main(String[] args) {

        Number number1 = new Number(0);
        Number number2 = new Number(0);

        Thread thread1 = new Thread(number1::incrementNum);
        Thread thread2 = new Thread(number2::incrementNum);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(number1.getNum());
        System.out.println(number2.getNum());
    }
}
