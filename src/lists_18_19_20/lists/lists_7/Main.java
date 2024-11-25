package lists_18_19_20.lists.lists_7;

import java.util.ArrayList;
import java.util.List;

/**
 * 7.	Дан список и массив int. Вставить все элементы из массива в середину списка.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Integer[] arr = {-1, -2, -3, -4, -5};
        Util.moveArrayToCenterOfList(list, arr);
        System.out.println(list);
    }
}
