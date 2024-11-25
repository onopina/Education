package map_22_23.map.map_2;

import java.util.*;

/**
 * Часть 2
 * Дан массив с повторяющимися элементами.
 * Создать из массива Map<Integer, Integer>, где ключ – уникальное число из массива,
 * значение – количество его повторений в массиве.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 7, 1, 10, 8, 7, 6, 4, 1};

        Map<Integer, Integer> map = new HashMap<>();   // Key - уникальное число, Value - кол-во повторений

        for (Integer number : arr){
            Integer count = map.get(number);
            map.put(number, (count == null) ? 1 : count+1);
        }
        printResult(map);
    }
    public static void printResult(Map<Integer, Integer> map){
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println("The number " + entry.getKey() + " appears in the array " + entry.getValue() + " times");
        }
    }
}
