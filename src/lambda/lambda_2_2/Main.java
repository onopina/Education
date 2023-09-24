package lambda.lambda_2_2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * 2.	Дано пять разных реализаций методов (void).
 * Методы принимают один параметр и выводят его на консоль (с указанием номера метода).
 * Пример: метод один выводит – элемент равен 100, метод – первый.
 * Написать код, который вызывает все 5 методов с одним числом. Все методы реализовать через лямбда-выражение.
 * Подсказка: не нужно создавать 5 отдельных методов – можно использовать функциональный интерфейс.
 */
public class Main {
    public static void main(String[] args) {
        final int element = 100;

        for (int i = 1; i <= 5; i++) {
            print(x -> System.out.println("The element is " + element + ". Method # " + x), i);
        }
    }

    public static void print(Consumer<Integer> consumer, int num){
        consumer.accept(num);
    }
}
