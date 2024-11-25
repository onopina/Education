package lists_18_19_20.lists.lists_8;

import java.util.ArrayList;
import java.util.List;

/**
 * 8.	Удалить из списка все дубликаты подряд
 * (то есть одинаковые идущие подряд элементы, оставить элемент в единственном экземпляре).
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(5);
        list.add(5);
        list.add(10);
        list.add(10);

        System.out.println(list);
        Util.removeDuplicatesInRow(list);
        System.out.println(list);
    }
}
