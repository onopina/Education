package conditions_2;

/**
 * 7.	Даны два числа (могут быть как положительные, так и отрицательные).
 * Определить пару знаков:
 * +- (первое положительное, второе отрицательное),
 * -- (оба отрицательные) и так далее.
 */
public class HW1_7 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 0;
        if (n1 > 0 && n2 > 0) {
            System.out.println("Positive & Positive");
        } else if (n1 > 0 && n2 < 0) {
            System.out.println("Positive & Negative");
        } else if (n1 < 0 && n2 > 0) {
            System.out.println("Negative & Positive");
        } else if (n1 < 0 && n2 < 0) {
            System.out.println("Negative & Negative");
        } else {
            System.out.println("One or both numbers equal zero");
        }
    }
}
