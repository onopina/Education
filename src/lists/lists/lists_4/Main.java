package lists.lists.lists_4;

import java.util.Arrays;
import java.util.List;

/**
 * 4.	Преобразовать массив в список.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> list = Util.arrayToList(arr);
        System.out.println(list);

        List<Integer> list1 = Arrays.asList(arr);
        System.out.println(list1);
    }
}
