package generics.generics_3_5;

import java.util.ArrayList;
import java.util.List;

/**
 * 5.	Написать метод, который принимает любой один параметр, а другой – varargs (всего два параметра).
 * Вывести на консоль.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Util.addElements(list, 10, 15, 20);
        System.out.println(list);
    }
}
