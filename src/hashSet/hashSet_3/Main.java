package hashSet.hashSet_3;

import java.util.*;

/**
 * 3.	Дан массив чисел. Также дано определенное число (num).
 * Определить количество пар элементов массива (a[i] и a[j], индексы не могут совпадать),
 * для которых выполняется: a[i] + a[j] = num. Реализация должна составлять O(n).
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 5, 2, 2, 2, 5, 5, 4, 4};  // answer = 3
        int sum = 7;

        System.out.println("The result is " + getPairsCount(numbers, sum));
    }

    public static int getPairsCount(int[] arr, int sum){
        Map<Integer, Integer> map = new HashMap<>();

        int count = 0;

        for (int num : arr) {
            if (map.containsKey(sum - num)) {
                count++;
                map.put(sum-num, map.get(sum-num) - 1);
                if (map.get(sum-num) == 0)
                    map.remove(sum-num);
            }
            else if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
            System.out.println(count);
        }
        System.out.println(map);
        return count;
    }
}
