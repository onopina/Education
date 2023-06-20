package iterator.iterator_4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 4.	Дан Set. Удалить из него все нечетные элементы.
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(5);
        set.add(2);
        set.add(4);
        set.add(7);
        set.add(9);
        set.add(10);
        set.add(3);

        System.out.println(removeEvenNumbers(set));

    }
    public static Set<Integer> removeEvenNumbers(Set<Integer> set){
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
            Integer num = iterator.next();
            if (num % 2 == 0)
                iterator.remove();
        }
        return set;
    }
}
