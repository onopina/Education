package stream_API_32.stream_3_3;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 3.	* Аналогичное условие, что и во 2 задаче.
 * Нужно найти среднее по каждому предмету (учитывать особенность из 2 пункта).
 */
public class Main {
    public static void main(String[] args) {
        String[] subjects = {"Math", "History", "Music", "English", "Geography"};

        Student[] students = {
                new Student("Maria", Map.of("Math", 5, "History", 4, "Music", 5, "English", 4, "Geography", null)),
                new Student("Sergey", Map.of("Math", 3, "English", 4, "Music", 5, "Geography", 4)),
                new Student("Petr", Map.of("Geography", 3, "History", 5, "Music", 4, "Math", 4))
        };

        System.out.println(getAverageMarkBySubject(students));
    }

    public static Map<String, Double> getAverageMarkBySubject(Student[] students) {
        return Arrays.stream(students)
                .flatMap(x -> x.getMarks().entrySet().stream())
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.averagingDouble(Map.Entry::getValue)));
    }
}
