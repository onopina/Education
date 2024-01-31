package multithreading.multithreading_3_4;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 4.	Дан список, с которым работают два потока.
 * Каждый поток применяет одну из двух допустимых операций:
 * добавляет элемент в список (0), удаляет элемент из списка (1).
 * Числа 0 и 1 генерируются случайно.
 * От этого зависит, какая операция будет применена.
 * Посчитать количество добавлений и удалений, убедиться, что размер правильный.
 */
public class Main {
    private static final AtomicInteger numberOfAddings = new AtomicInteger();
    private static final AtomicInteger numberOfRemovings = new AtomicInteger();

    public static void main(String[] args) {
        MyList myList = new MyList();

        Thread[] threads = new Thread[2];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 5; j++) {
                    addOrRemove(myList);
                }
            });
        }

        threads[0].start();
        threads[1].start();

        try {
            threads[0].join();
            threads[1].join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("The final list is " + myList.getList());
        System.out.println("The number of addings is " + numberOfAddings);
        System.out.println("The number of removings is " + numberOfRemovings);
    }

    private static int getRandom(){
        Random random = new Random();
        return random.nextInt(0, 2);
    }

    private static void addOrRemove(MyList myList){
        int random = getRandom();
        if (random == 0){
            System.out.println("The random number is " + random);
            myList.addElement();
            numberOfAddings.incrementAndGet();
        }
        else if (random == 1){
            System.out.println("The random number is " + random);
            if (!myList.getList().isEmpty()){
                numberOfRemovings.incrementAndGet();
            }
            myList.removeElement();
        }
    }
}
