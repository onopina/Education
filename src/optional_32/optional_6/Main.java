package optional_32.optional_6;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 6.	Дано 10 массивов. Часть из них пустая (или null).
 * Реализовать алгоритм поиска среднего всех массивов (всех чисел из всех массивов) двумя способами.
 * Через обычный цикл и собственную реализацию метода average; через StreamApi.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {5, 10};
        int[] arr2 = {15, -8};
        int[] arr3 = {};
        int[] arr4 = {20, 25};
        int[] arr5 = {30, -15, 10};
        int[] arr6 = {10, 13};
        int[] arr7 = {};
        int[] arr8 = {};
        int[] arr9 = {35, 40};
        int[] arr10 = {45, 50};

        int[][] totalArray = {arr1, arr2, arr3, arr4, arr5, arr6, arr7, arr8, arr9, arr10};

        System.out.println(getAverage(totalArray));

        System.out.println(Stream.of(totalArray).flatMapToInt(Arrays::stream).average().getAsDouble());
    }
    public static double getAverage(int[][] arr){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                count++;
            }
        }
        return sum/count;
    }
}
