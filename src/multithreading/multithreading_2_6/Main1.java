package multithreading.multithreading_2_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Вариант без потоков - Для сравнения времени работы
 */
public class Main1 {
    private static final List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
    private static final List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));
    private static final List<Integer> list3 = new ArrayList<>(Arrays.asList(7, 8, 9));
    private static final List<Integer> list4 = new ArrayList<>(Arrays.asList(10, 11, 12));
    private static final List<Integer> list5 = new ArrayList<>(Arrays.asList(13, 14, 15));

    private static final List<Integer> result = new ArrayList<>();
    public static void main(String[] args) {

        long start = System.nanoTime();

        result.addAll(list1);
        result.addAll(list2);
        result.addAll(list3);
        result.addAll(list4);
        result.addAll(list5);

        System.out.println(result);

        long finish = System.nanoTime() - start;

        System.out.println("The time is " + finish);
    }
}
