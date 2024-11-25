package stream_API_32.stream_2_5;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * 5.	Решить задачу 4 так, чтобы после удаления дубликатов получить отсортированную последовательность.
 * Использовать sorted нельзя.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 10, 0, 25, 10,-15, 0, -30, 25, 10, 35);

        list.stream()
                .collect(Collectors.toCollection(() -> new TreeSet<>()))
                .forEach(System.out::println);
    }
}
