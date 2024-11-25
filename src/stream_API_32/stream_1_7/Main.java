package stream_API_32.stream_1_7;

import java.util.*;
import java.util.stream.Stream;

/**
 * 7.	Преобразовать массив Студентов в поток String следующего вида: «Mike: [4, 5, 3]» (имя и в скобках все оценки).
 * Не использовать toString метод.
 */
public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Maria", Map.of("Math", List.of(5, 5, 4), "History", List.of(4, 3, 5), "Music", List.of(5, 5, 5))),
                new Student("Sergey", Map.of("Math", List.of(4, 4, 3), "History", List.of(5, 4, 5), "Music", List.of(4, 5, 4))),
                new Student("Petr", Map.of("Math", List.of(4, 5, 5), "History", List.of(2, 3, 3), "Music", List.of(3, 5, 4)))
        };

        Stream<String> studentsMarks = Arrays.stream(students)
                .map(x -> x.getName() + ": " + x.getMarks()
                        .values()
                        .stream()
                        .flatMap(Collection::stream)
                        .toList());

        studentsMarks.forEach(System.out::println);
    }
}
