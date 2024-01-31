package multithreading.multithreading_2_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 6.	Дано 5 списков.
 * Написать многопоточную программу, в которой списки записываются в один общий файл в правильном порядке.
 */
public class Main {
    private static final List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
    private static final List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));
    private static final List<Integer> list3 = new ArrayList<>(Arrays.asList(7, 8, 9));
    private static final List<Integer> list4 = new ArrayList<>(Arrays.asList(10, 11, 12));
    private static final List<Integer> list5 = new ArrayList<>(Arrays.asList(13, 14, 15));

    private static final List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        long start = System.nanoTime();

        List[] allLists = {list1, list2, list3, list4, list5};
        Thread[] threads = new Thread[5];

        for (int i = 0; i < threads.length; i++) {
            int finalI = i;
            threads[i] = new Thread(() -> fillPartOfResultList(allLists[finalI]));
            threads[i].start();
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(result);

        long finish = System.nanoTime() - start;

        System.out.println("The time is " + finish);
    }

    public static void fillPartOfResultList(List<Integer> list){
        result.addAll(list);
    }
}
