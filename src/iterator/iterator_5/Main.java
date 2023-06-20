package iterator.iterator_5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 5.	*Дан Set (выбрать реализацию самостоятельно). Удалить из Set все элементы, большие 30.
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(50);
        set.add(15);
        set.add(20);
        set.add(45);
        set.add(10);
        set.add(65);

        System.out.println(removeNumbersMore30(set));

    }
    public static Set<Integer> removeNumbersMore30(Set<Integer> set){
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
            Integer num = iterator.next();
            if (num > 30)
                iterator.remove();
        }
        return set;
    }
}
