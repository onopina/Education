package collections_26.collections_3;

import java.util.*;

/**
 * 3.	Дано дерево, содержащее числа. Вывести его в обратном порядке.
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(15);
        set.add(5);
        set.add(10);
        set.add(30);
        set.add(25);
        set.add(20);

        List<Integer> list = new ArrayList<>(set);
        Collections.reverse(list);
        System.out.println(list);
    }
}
