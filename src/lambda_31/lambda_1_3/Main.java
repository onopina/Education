package lambda_31.lambda_1_3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * 3.	Дан список List<String>, в котором элементы являются числами (“10”, “20”, “40” и тд).
 * Преобразовать список в List<Integer>.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");

        func(Integer::valueOf, list);
    }

    public static void func(Function<String, Integer> function, List<String> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(function.apply(list.get(i)));
        }
    }
}
