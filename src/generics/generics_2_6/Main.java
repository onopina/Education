package generics.generics_2_6;

import java.util.ArrayList;
import java.util.List;

/**
 * 6.	Создать класс Util. Добавить в него метод, сравнивающий суммы двух числовых списков.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(6);
        list1.add(7);

        List<Double> list2 = new ArrayList<>();
        list2.add(1.5);
        list2.add(2.5);
        list2.add(3.5);

        System.out.println(Util.compareSumOfLists(list1, list2));
    }
}
