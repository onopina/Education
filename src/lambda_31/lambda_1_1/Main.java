package lambda_31.lambda_1_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.	Отфильтровать список следующим образом: оставить элементы, которые больше 10 и меньше 100.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(-10);
        list.add(25);
        list.add(120);
        list.add(-50);

        list.removeIf(x -> x<=10);
        list.removeIf(x -> x>=100);

        System.out.println(list);
    }
}
