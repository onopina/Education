package hashSet.hashSet_4;

import java.util.HashMap;
import java.util.Map;

/**
 * 4.	Дан текст. Необходимо подсчитать количество вхождений каждого символа.
 */

public class Main {
    public static void main(String[] args) {
        String text = "Hello Java World!";
        System.out.println(getCharCount(text));
    }

    public static Map<Character, Integer> getCharCount(String text){
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else map.put(ch, 1);
        }
        return map;
    }
}
