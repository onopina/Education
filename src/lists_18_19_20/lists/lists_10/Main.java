package lists_18_19_20.lists.lists_10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 10.	Даны ArrayList и LinkedList, заполненные числами. Добавить все элементы из одного цикла в другой.
 */
public class Main {
    public static void main(String[] args) {
        List<Number> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        List<Number> linkedList = new LinkedList<>();
        linkedList.add(1.5);
        linkedList.add(2.5);
        linkedList.add(3.5);
        linkedList.add(4.5);
        linkedList.add(5.5);

        Util.switchLists(arrayList, linkedList);

        System.out.println(arrayList);
        System.out.println(linkedList);
    }
}
