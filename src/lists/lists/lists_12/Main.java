package lists.lists.lists_12;

/**
 * 12.	Операция trimToSize устанавливает вместимость массива внутри ArrayList в фактическое количество элементов,
 * которое в нем содержится (size). Если создать ArrayList, то он изначально создается с size=0 и capacity=10.
 * Операция trimToSize установит вместимость в capacity=size=0.
 * Задача: создать массив на большое количество элементов.
 * Заполнить некоторую часть массива (не полностью) с помощью Random.
 * Далее самостоятельно реализовать операцию trimToSize для текущего массива.
 */
public class Main {
    public static void main(String[] args) {
        MyArrayList numbers = new MyArrayList();
        numbers.ensureCapacity(50);
        numbers.addRandom(10);
        numbers.printList();
        System.out.println("The capacity is " + numbers.getCapacity());
        System.out.println("The size is " + numbers.getSize());
        numbers.trimToSize();
        System.out.println("The capacity after optimization is " + numbers.getCapacity());
    }
}
