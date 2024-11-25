package generics_13.generics_1_2345;

import java.util.ArrayList;
import java.util.List;

/**
 * 2.	Создать список (ArrayList), который может хранить любой тип. Создать класс Util.
 * Добавить в класс Util метод, который выводит на консоль такой список.

 * 3.	Добавить в класс Util метод, заполняющий любой список определенным элементом (значением).

 * 4.	В класс Util добавить метод добавления элемента в любой список.

 * 5.	В класс Util добавить метод получения элемента по индексу из списка.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Util.printList(list);

        Util.fill(list, 5);

        Util.printList(list);

        Util.addElement(list, 7);

        Util.printList(list);

        System.out.println(Util.getElement(list, 5));

    }
}
