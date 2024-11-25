package treeset_treemap_25.treeset_treemap_1_2;

import java.util.Map;
import java.util.TreeMap;

/**
 * 2.	Дан массив. Посчитать в отсортированном виде, сколько раз входит каждый элемент в массив
 * (1 – 4, 2 – 3, 3 – 6 и т.д., отсортировано по ключу).
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {-10, -15, 8, 7, -10, -4, 10, 8, 8, 15, 3, -2};

        Map<Integer, Integer> map = new TreeMap<>();

        for (Integer number : arr){
            Integer count = map.get(number);
            map.put(number, (count == null) ? 1 : count+1);
        }

        System.out.println(map);
    }
}
