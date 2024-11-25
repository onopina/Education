package stream_API_32.stream_1_8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * 8.	Дан массив Студентов. Вывести на консоль только тех, у кого нет троек.
 */
public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Maria", Map.of("Math", List.of(5, 5, 4), "History", List.of(4, 4, 5), "Music", List.of(5, 5, 5))),
                new Student("Sergey", Map.of("Math", List.of(4, 4, 3), "History", List.of(5, 4, 5), "Music", List.of(4, 5, 4))),
                new Student("Petr", Map.of("Math", List.of(4, 5, 5), "History", List.of(2, 3, 3), "Music", List.of(3, 5, 4)))
        };

        Stream<Student> studentsWithout3 = Arrays.stream(students)
                .filter(x -> x.getMarks()
                        .values()
                        .stream()
                        .flatMap(Collection::stream)
                        .noneMatch(z -> z==3));

        studentsWithout3.forEach(x -> System.out.println("The students who don't have the mark '3' are:\n" + x.getName()));
    }
}
