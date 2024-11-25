package stream_API_32.stream_1_2;

import java.util.stream.Stream;

/**
 * 2.	Дана последовательность чисел от 0 до 1_000. Оставить в потоке только квадраты чисел (0, 1, 4, 9, 16 и тд).
 */
public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(0, x -> x+1)
                .limit(1001)
                .filter(x -> Math.sqrt(x)%1 == 0);

        stream.forEach(System.out::println);
    }
}
