package lists.lists.lists_2;

import java.util.ArrayList;
import java.util.List;

/**
 * 2.	Дан список. Удалить из него дубликаты элементов (каждый элемент содержится в единственном экземпляре).
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(5);
        list.add(5);
        list.add(10);

        System.out.println(list);
        Util.removeDuplicates(list);
        System.out.println(list);

        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("Hello");
        words.add("Java");
        words.add("World");
        words.add("Java");
        words.add("Hello");

        System.out.println(words);
        Util.removeDuplicates(words);
        System.out.println(words);
    }



}
