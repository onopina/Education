package conditions_2;

/**
 * 3.	Определить один случай из трех: переменная положительная, переменная отрицательная, равна нулю.
 */
public class HW1_3 {
    public static void main(String[] args) {
        int n = 0;
        if (n > 0) {
            System.out.println("The number is positive");
        } else if (n < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number equals zero");
        }
    }
}
