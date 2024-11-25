package lists_18_19_20.arrayList.arrayList_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 Часть 2:
 Написать собственную реализацию ArrayList:
 1.	Класс должен быть обобщенным.
 2.	Добавить методы: добавление в конец, добавления по любому индексу (вставка), добавление в начало – три отдельных метода.
 3.	Добавить методы: удаление из начала, произвольное удаление, удаление из конца – три отдельных метода.
 4.	Добавить методы get(index) и set(newValue, index).
 5.	Добавить метод проверки, содержится ли элемент в списке.
 6.	Добавить специальные методы: trimToSize, ensureCapacity.
 7.	Добавить специальные методы: toArray (возвращает T[]), addAll (void, добавляет в текущий список все элементы из другого списка.
 8.	Добавить метод, сортирующий список.
 9.	Оценить сложность всех операций оценкой Big O.
 */
public class Main {
    public static void main(String[] args) {

        MyArrayList<Integer> list = new MyArrayList<>();
        list.addByIndex(0, 10);
        list.addByIndex(0, 5);
        list.addLast(15);
        list.addFirst(0);
        list.removeLast();
        list.set(2, 1);

        list.print();

        System.out.println(list.contains(10));

        Integer[] arr = list.toArray(new Integer[list.getSize()]);  //А если нет метода getSize()?..
        System.out.println(Arrays.toString(arr));

        Integer[] arr1 = list.toArray1(new Integer[0]);  //Здесь Unchecked cast: 'java.lang.Object[]' to 'E[]'
        System.out.println(Arrays.toString(arr1));

        Integer[] arr2 = list.toArray2(Integer.class);  //Unchecked cast: 'java.lang.Object[]' to 'E[]'
        System.out.println(Arrays.toString(arr2));

        System.out.println("The size is " + list.getSize());
        System.out.println("The capacity is " + list.getCapacity());

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list.addAll(list1);

        System.out.println(Arrays.toString(list.getData()));

        System.out.println("The size is " + list.getSize());
        System.out.println("The capacity is " + list.getCapacity());

        list.sort();

        System.out.println(Arrays.toString(list.getData()));
    }
}
