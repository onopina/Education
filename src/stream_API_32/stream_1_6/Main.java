package stream_API_32.stream_1_6;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * 6.	Дан класс Student.
 * Поля: имя, Map<String, List<Integer>> marks – отображение <название предмета – список оценок по нему>.
 * Преобразовать массив студентов в Stream<Integer> всех оценок всех студентов.
 */
public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Maria", Map.of("Math", List.of(5, 5, 4), "History", List.of(4, 3, 5), "Music", List.of(5, 5, 5))),
                new Student("Sergey", Map.of("Math", List.of(4, 4, 3), "History", List.of(5, 4, 5), "Music", List.of(4, 5, 4))),
                new Student("Petr", Map.of("Math", List.of(4, 5, 5), "History", List.of(2, 3, 3), "Music", List.of(3, 5, 4)))
        };

        Stream<Integer> allMarks = Arrays.stream(students)
                .flatMap(x -> x.getMarks()
                        .values()
                        .stream()
                        .flatMap(Collection::stream));

        allMarks.forEach(System.out::println);
    }
}
