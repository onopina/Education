package presentation.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        Set<Integer> set = map.keySet();
        for (Integer k: set){
            System.out.println(k);
        }

        Collection<String> values = map.values();
        for (String v : values){
            System.out.println(v);
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Map.Entry<Integer, String> entry : entries){
            int k = entry.getKey();
            String v = entry.getValue();
            entry.setValue("hello");
            System.out.println(k + " " + entry.getValue());

        }



    }
}
