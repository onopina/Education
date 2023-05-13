package algorithm.algorithm_3;

/**
 * 3.	Оценить сложность алгоритма поиска максимального элемента в массиве.
 * BigO = O(n) - линейная сложность
 */
public class Main {
    public static void main(String[] args) {
        int max = getMax(new int[]{5, 10, 15, 50, 25, -5, 35});
        System.out.println(max);
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]>max){
                max = arr[i+1];
            }
        }
        return max;
    }
}
