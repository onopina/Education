package lists_18_19_20.lists.lists_11;

import java.util.ArrayList;
import java.util.List;

/**
 * 11.	Создать List с помощью статического метода of.
 * Попробовать добавить в него элементы, попробовать изменить такой список.
 * Какой получается результат?
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 30);
//        list.add(40);
//        list.set(0, 15);
        System.out.println(list);
        // Immutable collection - нельзя изменить

        List<Integer> list1 = new ArrayList<>(List.of(10, 20, 30));
        list1.add(40);
        list1.set(0, 15);
        System.out.println(list1);
        // Wrap with ArrayList - ok
    }
}
