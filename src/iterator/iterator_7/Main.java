package iterator.iterator_7;

import java.util.Iterator;

/**
 * 7.	Реализовать Iterable в классе MyLinkedList (собственная реализация).
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num % 2 == 0)
                iterator.remove();
        }

        list.print();
    }
}
