package trees.trees_1_7;

import java.util.NavigableMap;
import java.util.TreeMap;

public class ConverterToRoman {
    NavigableMap<Integer, String> map = new TreeMap<>();

    public ConverterToRoman() {
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        map = map.descendingMap();
    }

    public String convertToRoman(int num){
        StringBuilder result = new StringBuilder();
        for (Integer key : map.keySet()){
            while (num >= key){
                result.append(map.get(key));
                num = num - key;
            }
        }
        return result.toString();
    }
}
