package conditions_2;

/**
 * 5.	Дана переменная от 1 до 7. Определить день недели, исходя из номера переменной, если 1 – это понедельник.
 */
public class HW1_5_switch {
    public static void main(String[] args) {
        int day = 5;
        switch (day) {
            case 1 -> System.out.println("Today is Monday");
            case 2 -> System.out.println("Today is Tuesday");
            case 3 -> System.out.println("Today is Wednesday");
            case 4 -> System.out.println("Today is Thursday");
            case 5 -> System.out.println("Today is Friday");
            case 6 -> System.out.println("Today is Saturday");
            case 7 -> System.out.println("Today is Sunday");
            default -> System.out.println("Please enter a number between 1 and 7");
        }
    }
}
