package lists_18_19_20.lists.lists_6;

import java.util.ArrayList;
import java.util.List;

/**
 * 6.	Дан список. Удалить из списка первый и последний элемент.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Toyota");
        list.add("BMW");
        list.add("Suzuki");
        list.add("Honda");
        list.add("Mitsubishi");
        Util.removeFirstAndLast(list);
        System.out.println(list);
    }
}
