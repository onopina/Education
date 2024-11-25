package map_22_23.map.map_4;

import java.util.*;

/**
 * Часть 4 *
 * Создать Map. Добавить несколько значений. Отсортировать по ключу (по возрастанию).
 */
public class Main {
    public static void main(String[] args) {
        Map<String, String> numbers = new HashMap<>();
        numbers.put("user01", "one");
        numbers.put("user02", "two");
        numbers.put("user10", "ten");
        numbers.put("user05", "five");
        numbers.put("user03", "three");
        numbers.put("user04", "four");

        List<String> listOfKeys = new ArrayList<>(numbers.keySet());

        listOfKeys.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(listOfKeys);
    }
}
