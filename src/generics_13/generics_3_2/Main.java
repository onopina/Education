package generics_13.generics_3_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 2.	Переписать пример из 2 второго номера, но не реализовывать Comparable.
 * Вместо воспользоваться обобщенным интерфейсом Comparator.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(15);
        list.add(-5);
        list.add(-50);
        list.sort((new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        }));
//        list.sort(new Sort<>());
        System.out.println(list);
    }
}
