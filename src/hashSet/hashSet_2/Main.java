package hashSet.hashSet_2;

import java.util.*;

/**
 * 2.	Дан список, содержащий много элементов (с повторениями).
 * Отсортировать список. Удалить из списка дубликаты.
 * Реализация должна составлять O(n).
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(-5);
        list.add(5);
        list.add(15);
        list.add(0);
        list.add(20);
        list.add(25);
        list.add(15);
        list.add(0);

        System.out.println(list);

        Set<Integer> set = new TreeSet<>(list);

        System.out.println(set);
    }
}
