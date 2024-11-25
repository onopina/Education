package treeset_treemap_25.treeset_treemap_1_1;

import java.util.Set;
import java.util.TreeSet;

/**
 * 1.	Дан массив. Отсортировать его с помощью TreeSet.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {-10, -15, 8, 7, 0, -4, 10, 15, 3, -2};

        Set<Integer> set = new TreeSet<>();

        for (Integer number : arr){
            set.add(number);
        }

        System.out.println(set);
    }
}
