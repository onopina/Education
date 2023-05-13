package algorithm.algorithm_8;

/**
 * 8.	Рассмотреть алгоритм. Оценить его сложность:
 * BigO = O(n) - линейная сложность
 */
public class Main {
    public static void main(String[] args) {
        example();
    }
    public static void example(){
        int n = 100;  //array size
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 1000000; j++) {
                System.out.println(i + " : " + j);
            }
        }
    }
}
