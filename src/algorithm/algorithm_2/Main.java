package algorithm.algorithm_2;

/**
 * 2.	Оценить сложность алгоритма нахождения среднего значения массива.
 * BigO = O(n) - линейная сложность
 */
public class Main {
    public static void main(String[] args) {
        double average = getAverageOfArray(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println(average);

    }

    public static double getAverageOfArray(int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
}

