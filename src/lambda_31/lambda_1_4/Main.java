package lambda_31.lambda_1_4;

import java.util.Comparator;

/**
 * 4.	Реализовать Компаратор, сравнивающий строки по длине.
 */
public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Java";

        Comparator<String> comparator = (Comparator.comparingInt(String::length));

        System.out.println(comparator.compare(str1, str2));
    }
}
