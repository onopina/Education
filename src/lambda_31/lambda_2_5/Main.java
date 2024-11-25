package lambda_31.lambda_2_5;

import java.util.function.BinaryOperator;

/**
 * 5.	Написать метод, который может принять лямбда-выражение в качестве параметра.
 * Лямбда-выражение должно использовать два параметра и преобразовывать их в строку
 * (строка должна быть возвращаемым значением).
 * Использовать существующий функциональный интерфейс.
 */
public class Main {
    public static void main(String[] args) {
        String result = func(String::concat, "Hello ", "Java");
        System.out.println(result);
    }
    public static String func(BinaryOperator<String> operator, String str1, String str2){
        return operator.apply(str1, str2);
    }
}
