package map.hashMap.hashMap_1_2;

import java.util.*;

public class Utils {
    public static <K, V> Set<K> getKeys(Map<K, V> map){
        return map.keySet();
    }

    public static <K, V> Collection<V> getValues(Map<K, V> map){
        return map.values();
    }

    public static <K, V> Set<Map.Entry<K, V>> getKeysValues(Map<K, V> map){
        return map.entrySet();
    }

    public static <K, V> List<?> generateList(Map<K, V> map){
        List<String> list = new ArrayList<>(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()){
            list.add(entry.getKey() + " " + entry.getValue());
        }
        return list;
    }
}
