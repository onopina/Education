package collections_26.collections_4;

import java.util.Set;
import java.util.TreeSet;

/**
 * 4.	*Дан массив с повторениями. Отсортировать его за O(n) (учитывая повторения).
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 8, -2, 4, 6, 8, 0, -2, 10};

        Set<Integer> set = new TreeSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println(set);
    }
}
