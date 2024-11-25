package oop_5.myArray;

/**
 * Часть 3:
 * 1.	Создать класс MyArray. Добавить поле int[] arr.
 * 2.	Конструктор не нужен.
 * 3.	Добавить методы: для заполнения массива с консоли (размер определяет пользователь),
 * для вывода массива на консоль.
 * 4.	Добавить методы: для суммы массива, для среднего значения массива.
 * 5.	Добавить методы: для изменения элемента массива (элемент и индекс вводит пользователь).
 * 6.	Добавить метод, проверяющий массив на следующее: все элементы положительные – true, иначе – false.
 * 7.	Добавить метод, находящий количество отрицательных элементов.
 * 8.	Добавить метод, преобразующий все отрицательные элементы в положительные (меняется знак).
 */
public class Main {
    public static void main(String[] args) {

        MyArray array = new MyArray();
        array.inputArray();
        array.outputArray();
        array.sumArray();
        array.averageArray();
        array.changeArray();
        boolean check = array.positiveArray();
        System.out.println(check);
        int count = array.countNegArray();
        System.out.println("The numbers of negative elements is " + count);
        array.changeNegArray();
    }
}
