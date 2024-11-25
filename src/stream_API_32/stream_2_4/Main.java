package stream_API_32.stream_2_4;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 4.	Дан список с повторениями. Убрать из него повторения двумя способами с помощью stream.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 10, 0, 25, 10,-15, 0, -30, 25, 10, 35);

        list.stream()
                .distinct()
                .forEach(x -> System.out.print(x + " "));

        System.out.println();

        list.stream()
                .collect(Collectors.groupingBy(x -> x))
                .forEach((x, y) -> System.out.print(x + " "));
    }
}
