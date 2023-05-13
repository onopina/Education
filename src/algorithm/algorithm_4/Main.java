package algorithm.algorithm_4;

import java.util.Arrays;

/**
 * 4.	Реализовать пузырьковую сортировку (описание можно посмотреть в интернете, это самая простая сортировка).
 * Оценить ее сложность
 * BigO = O(n^2) - квадратичная сложность
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = bubbleSort(new int[]{5, -5, 10, 15, 0, -10});
        System.out.println(Arrays.toString(arr));
    }

    public static int[] bubbleSort(int[] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i + 1] < arr[i]) {
                    int tmp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = tmp;
                    isSorted = false;
                }
            }
        }
        return arr;
    }
}





