package lists.lists.lists_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1.	Дан список (ArrayList). Найти:
 * •	сумму элементов списка
 * •	сумму четных элементов списка
 * •	количество вхождений элемента в список (количество повторений)
 * •	индекс максимального элемента
 * •	индекс минимального элемента
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(Util.getSumOfElements(list));
        System.out.println(Util.getSumOfEvenElements(list));
        list.add(5);
        System.out.println(Util.getNumberOfRepeatOfElement(list, 5));
        System.out.println(list.indexOf(Collections.max(list)));
        System.out.println(list.indexOf(Collections.min(list)));
    }
}
