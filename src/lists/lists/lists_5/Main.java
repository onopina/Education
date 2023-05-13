package lists.lists.lists_5;

import java.util.LinkedList;
import java.util.List;

/**
 * 5.	Дан LinkedList. Удалить из него каждый третий элемент.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);

        Util.removeEveryThirdElement(list);
        System.out.println(list);
    }
}
