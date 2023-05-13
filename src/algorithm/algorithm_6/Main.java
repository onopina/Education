package algorithm.algorithm_6;

/**
 * 6.	Рассмотреть алгоритм. Понять, что он делает. Оценить его сложность:
 * Алгоритм считает кол-во повторений заданного числа в массиве
 * BigO = O(n) - линейная сложность
 */
public class Main {
    public static void main(String[] args) {
        int num = count(new int[]{5, 10, 15, 5, 10, 15}, 10);
        System.out.println(num);
    }

    public static int count(int[] arr, int value){
        int count = 0;
        for(int num : arr){
            if (num == value){
                count++;
            }
        }
        return count;
    }
}
