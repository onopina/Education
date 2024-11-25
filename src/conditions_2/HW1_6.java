package conditions_2;

/**
 * 6.	Дана операция (переменная String, + - * / %). Применить операцию к двум целым числам.
 */
public class HW1_6 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 5;
        String oper = "+"; // - * / + % > <
        switch (oper) {
            case "+" -> System.out.println(n1 + n2);
            case "-" -> System.out.println(n1 - n2);
            case "*" -> System.out.println(n1 * n2);
            case "/" -> System.out.println(n1 / n2);
            case "%" -> System.out.println(n1 % n2);
            case ">" -> System.out.println(n1 > n2);
            case "<" -> System.out.println(n1 < n2);
            default -> System.out.println("Please enter a correct operator");
        }
    }
}
