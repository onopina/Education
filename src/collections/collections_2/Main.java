package collections.collections_2;

import java.util.*;

/**
 * 2.	Дан отсортированный список.
 * Найти в этом списке определенный элемент (индекс).
 * Сложность должна составлять O(log n).
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(40);
        list.add(0);
        Collections.sort(list);
        System.out.println(list);

        int index = Collections.binarySearch(list, 30);
        System.out.println(index);
    }
}
