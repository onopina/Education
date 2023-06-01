package map.map.map_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Часть 5 *
 * Создать Map. Добавить несколько значений.
 * Перебрать пары ключ-значение, но не используя метод entrySet (и не sout(map)).
 */
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(50, "fifty");
        map.put(40, "forty");
        map.put(30, "thirty");
        map.put(20, "twenty");
        map.put(10, "ten");

        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
