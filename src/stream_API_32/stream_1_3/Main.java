package stream_API_32.stream_1_3;

import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

/**
 * 3.	Сгенерировать 10 случайных чисел.
 * Вывести на консоль следующий результат: первым должен быть выведен ВТОРОЙ максимум из последовательности
 * (остальной вывод не имеет значения). Не использовать циклы и условия.
 */
public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(0, x -> new Random().nextInt(100))
                .limit(10)
                .sorted(Comparator.reverseOrder())
                .skip(1);

        stream.forEach(System.out::println);
    }
}
