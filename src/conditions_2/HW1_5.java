package conditions_2;

/**
 * 5.	Дана переменная от 1 до 7. Определить день недели, исходя из номера переменной, если 1 – это понедельник.
 */
public class HW1_5 {
    public static void main(String[] args) {
        int n = 5;
        if (n == 1) {
            System.out.println("Today is Monday");
        } else if (n == 2) {
            System.out.println("Today is Tuesday");
        } else if (n == 3) {
            System.out.println("Today is Wednesday");
        } else if (n == 4) {
            System.out.println("Today is Thursday");
        } else if (n == 5) {
            System.out.println("Today is Friday");
        } else if (n == 6) {
            System.out.println("Today is Saturday");
        } else if (n == 7) {
            System.out.println("Today is Sunday");
        } else {
            System.out.println("Please enter a number between 1 and 7");
        }
    }
}
