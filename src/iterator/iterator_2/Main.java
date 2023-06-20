package iterator.iterator_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 2.	Проитерироваться по Map с помощью Iterator.
 */
public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Japan", "Tokio");
        map.put("France", "Paris");
        map.put("Spain", "Madrid");
        map.put("USA", "Washington");
        map.put("Canada", "Ottawa");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, String> elem = iterator.next();
            System.out.println(elem);
        }
    }
}
