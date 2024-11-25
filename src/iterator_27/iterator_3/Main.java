package iterator_27.iterator_3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 3.	Дан LinkedList. Удалить из него все четные элементы.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(10);
        list.add(3);

        System.out.println(removeEvenNumbers(list));
    }
    public static List<Integer> removeEvenNumbers(List<Integer> list){
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            Integer num = iterator.next();
            if (num % 2 == 0)
                iterator.remove();
        }
        return list;
    }
}
