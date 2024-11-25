package generics_13.generics_3_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.	Написать, класс реализующий интерфейс Comparable. Проверить работоспособность метода compareTo.
 * Написать метод, сортирующий любой список пузырьком.
 *
 */
public class Main {
    public static void main(String[] args) {
        Account account = new Account(1500);
        Account account1 = new Account(3500);
        System.out.println(account.compareTo(account1));

        Sort<Integer> bubble = new Sort<>();
        List<Integer>listToSort = new ArrayList<>();
        listToSort.add(10);
        listToSort.add(20);
        listToSort.add(15);
        listToSort.add(-5);
        listToSort.add(-50);
        bubble.bubbleSort(listToSort);
        System.out.println(listToSort);
    }
}
