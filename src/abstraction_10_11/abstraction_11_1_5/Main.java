package abstraction_10_11.abstraction_11_1_5;

/**
 * 5.	Описать абстрактный класс или интерфейс для работы со списком элементов
 *  (при выборе учитывать то, что список элементов – не только массив).
 *  Должны быть следующие методы: добавить элемент, вывести на консоль весь список,
 *  удалить элемент по индексу (по порядку с начала).
 *  Написать класс MyArrayList, который реализует интерфейс или расширяет абстрактный класс.
 */
public class Main {
    public static void main(String[] args) {

        MyArrayList list = new MyArrayList(new int[]{1, 3, 5, 7, 9, 11, 13});
        list.add_element(15);
        list.print_list();
        list.add_element(17);
        list.print_list();
        list.delete_element(3);
        list.print_list();

    }
}
