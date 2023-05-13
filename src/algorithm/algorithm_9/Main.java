package algorithm.algorithm_9;

/**
 * Рассмотреть алгоритм. Понять, что он делает. Оценить сложность алгоритма:
 *
 * Алгоритм вычисляет двоичный логарифм числа N (округляя до целого числа в большую сторону)
 * BigO = O(log N) - логарифмическая сложность
 */
public class Main {
    public static void main(String[] args) {
        example();
    }
    public static void example(){
        int n = 100;
        int count = 0;
        while (n>0) {
            n/=2;
            count++;
        }
        System.out.println(count);
    }
}
