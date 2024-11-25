package conditions_2;

/**
 * 4.	Определить результат сложения двух переменных: результат принадлежит диапазону 0-10 включительно,
 * 11-20 включительно, 21-30 включительно. Или не принадлежит ни одному из указанных диапазонов
 * (определить точно, в какой диапазон попало значение).
 */
public class HW1_4 {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 15;
        int n = n1 + n2;
        if (n >= 0 && n <=10) {
            System.out.println("The result is between 0 and 10");
        } else if (n > 10 && n <=20) {
            System.out.println("The result is between 11 and 20");
        } else if (n > 20 && n <=30) {
            System.out.println("The result is between 21 and 30");
        } else {
            System.out.println("The result doesn't match selected ranges");
        }
    }
}
