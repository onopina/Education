package lists_18_19_20.linkedList.linkedList_2;

import java.util.Arrays;

/**
 * Часть 2.
 * Написать собственную реализацию LinkedList:
 * 1.	Класс должен быть обобщенным.
 * 2.	Добавить методы: добавление элемента в начало, произвольное добавление, добавление в конец – три отдельных метода.
 * 3.	Добавить методы: удаление из начала, произвольное удаление, удаление из конца.
 * 4.	Добавить метод: удаление по ключу (удалить все вхождения данного элемента).
 * 5.	Добавить метод проверки, содержится ли элемент в списке.
 * 6.	Добавить метод toArray (возвращает T[]).
 * 7.	Есть ли смысл в методе trimToSize в связном списке? Если да, то добавить такой метод.
 *      - Смысла нет, т.к. в LinkedList нет параметра capacity и лишних ячеек массива (вообще нет массива)
 * 8.	Добавить метод, находящий сумму всех элементов списка (учесть, что список обобщенный).
 * 9.	Добавить три метода, имитирующие работу стека: push, pop, peek.
 * 10.	Посчитать сложность всех методов оценкой Big O.
 */
public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addLast(1);
        System.out.println();
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(3);

        list.addByIndex(4, 10);
        list.removeByIndex(4);

        list.print();
        System.out.println();

        list.removeByKey(3);

        list.print();
        System.out.println();

        System.out.println(list.contains(5));

        Integer[] arr = list.toArray(Integer.class);
        System.out.println(Arrays.toString(arr));

        System.out.println("The sum is " + list.getSum());

        list.push(2);
        System.out.println(list.pop());
        System.out.println(list.peek());

        System.out.println();
        list.print();
    }
}
