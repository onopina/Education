package iterator.iterator_6;

import java.util.Iterator;

/**
 * 6.	Реализовать Iterable в классе MyArrayList (собственная реализация).
 */
public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        list.addByIndex(0, 15);
        list.addByIndex(0, 10);
        list.addByIndex(0, 5);
        list.addByIndex(0, 0);
        list.addByIndex(0, -5);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            Integer num = iterator.next();
            if (num <= 0)
                iterator.remove();
        }

        list.print();
    }
}
