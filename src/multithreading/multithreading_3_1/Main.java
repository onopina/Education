package multithreading.multithreading_3_1;

/**
 * 1.	Дано три потока, которые работают с одним полем одного объекта.
 * Два потока увеличивают переменную, третий – уменьшает на единицу.
 * Написать корректную программу, в которой не происходит состояния гонок.
 */
public class Main {
    public static void main(String[] args) {
        Number number = new Number(10);

        Thread thread1 = new Thread(() -> number.setNum(number.getNum().incrementAndGet()));
        Thread thread2 = new Thread(() -> number.setNum(number.getNum().incrementAndGet()));
        Thread thread3 = new Thread(() -> number.setNum(number.getNum().decrementAndGet()));

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

        System.out.println(number.getNum());
    }
}
