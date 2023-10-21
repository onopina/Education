package stream_API.stream_1_4;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

/**
 * 4.	Дана последовательность случайных чисел от 0 до 9 (сгенерировать 1000 чисел).
 * Вывести один минимальный элемент (в выводе больше ничего не должно быть, кроме одного числа).
 * Нельзя использовать min.
 */
public class Main {
    public static void main(String[] args) {
        Optional<Integer> optionalOfMin = Stream.iterate(0, x -> new Random().nextInt(10))
                .limit(1000)
                .sorted()
                .findFirst();

        System.out.println(optionalOfMin.get());
    }
}
