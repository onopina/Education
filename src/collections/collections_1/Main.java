package collections.collections_1;

import java.util.HashSet;
import java.util.Set;

/**
 * 1.	Реализовать операцию «Симметричная разность» множеств
 * (с помощью имеющихся методов для операций с множествами) – см. презентацию.
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(4);
        set1.add(8);
        set1.add(2);
        set1.add(1);
        set1.add(10);

        Set<Integer> set2 = new HashSet<>();
        set2.add(8);
        set2.add(7);
        set2.add(5);
        set2.add(0);
        set2.add(1);

        Set<Integer> result = new HashSet<>(set1);

        result.addAll(set2);

        set1.retainAll(set2);

        result.removeAll(set1);

        System.out.println(result);
    }
}
