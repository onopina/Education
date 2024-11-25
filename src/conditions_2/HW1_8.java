package conditions_2;

/**
 * 8.	Дано римское число от 1 до 10 (I, II и тд). Вывести его в виде арабского числа.
 */
public class HW1_8 {
    public static void main(String[] args) {
        String roman = "V";
        switch (roman) {
            case "I" -> System.out.println("The Arabic number is 1");
            case "II" -> System.out.println("The Arabic number is 2");
            case "III" -> System.out.println("The Arabic number is 3");
            case "IV" -> System.out.println("The Arabic number is 4");
            case "V" -> System.out.println("The Arabic number is 5");
            case "VI" -> System.out.println("The Arabic number is 6");
            case "VII" -> System.out.println("The Arabic number is 7");
            case "VIII" -> System.out.println("The Arabic number is 8");
            case "IX" -> System.out.println("The Arabic number is 9");
            case "X" -> System.out.println("The Arabic number is 10");
            default -> System.out.println("Please enter a Roman number between I and X");
        }
    }
}
