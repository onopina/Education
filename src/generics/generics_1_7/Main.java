package generics.generics_1_7;

import java.util.Arrays;

/**
 * 7.	Реализовать простой класс MyArrayList (без расширения массива), способный хранить элементы любого типа.
 * Массив передается в конструктор MyArrayList в качестве параметра.
 * Реализовать методы: добавление элемента, удаление элемента по индексу, удаление элемента из начала,
 * получение элемента по индексу, изменение (set) элемента по индексу.
 * Предусмотреть исключительные ситуации. Бросить соответствующие исключения.
 */
public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>(new String[]{"Hello", "Java", "World"});
        System.out.println(Arrays.toString(list.addElement("!!!")).replace(',', ' '));
        System.out.println(Arrays.toString(list.removeElementByIndex(2)));
        System.out.println(Arrays.toString(list.removeFirstElement()));
        System.out.println(list.getElementByIndex(1));
        System.out.println(Arrays.toString(list.setElementByIndex("Super", 1)));
    }
}
