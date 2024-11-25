package stream_API_32.stream_1_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 1.	Создать поток тремя способами: из коллекции, из массива, из последовательности объектов.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 30);
        Stream<Integer> listStream = list.stream();

        int[] arr = {10, 20, 30};
        IntStream arrayStream = Arrays.stream(arr);

        Stream<Integer> streamOf = Stream.of(10, 20, 30);
    }
}
