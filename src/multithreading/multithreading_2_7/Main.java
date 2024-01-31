package multithreading.multithreading_2_7;

/**
 * 7.	Дан метод класс, в классе два поля – два списка.
 * Написать метод, который заполняет два списка.
 * Один вызов такого метода должен добавлять в каждый из списков по 10 элементов.
 * Вызвать метод 5 раз в 5 разных потоках на одном объекте такого класса.
 */
public class Main {
    public static void main(String[] args) {
        FillList fillList = new FillList();

        Thread[] threads = new Thread[5];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 5; j++) {
                    fillList.fill();
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

        fillList.getSizeOfLists();
    }
}
