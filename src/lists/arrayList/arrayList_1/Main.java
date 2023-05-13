package lists.arrayList.arrayList_1;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 Часть 1:
 1.	Изучить как хранится массив внутри ArrayList.
 2.	Изучить два метода ArrayList: trimToSize, ensureCapacity.
 3.	Изучить два метода (две разновидности) toArray.
 4.	Изучить метод addAll.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));

        Object[] arr1 = list.toArray();
        System.out.println(Arrays.toString(arr1));

        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(5);

        list.addAll(list1);
        System.out.println(list);
    }
}
