package lists.lists.lists_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 3.	Дан список. Преобразовать его в массив.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Object[] listToArray = Util.listToArray(list);
        System.out.println(Arrays.toString(listToArray));

        Integer[] listToIntArray = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToIntArray));

        Object[] listToIntArray1 = list.toArray();
        System.out.println(Arrays.toString(listToIntArray1));
    }
}
