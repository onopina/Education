package optional.optional_3;

import java.util.*;

/**
 * 3.	Дан метод поиска максимума списка.
 * Если результат найти не удается (списк null или пустой), вернуть пустой Optional.empty.
 * Если все корректно – обернуть результат и вернуть.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(5, 10, 25, 15, -5));
        List<Integer> list2 = new ArrayList<>();
        System.out.println(getMax(list1));
        System.out.println(getMax(list2));
    }
    public static Optional<Integer> getMax(List<Integer> list){
        if (list.isEmpty())
            return Optional.empty();
        else return Optional.of(Collections.max(list));
    }
}
