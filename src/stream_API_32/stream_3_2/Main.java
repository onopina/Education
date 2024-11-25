package stream_API_32.stream_3_2;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 2.	* Дано 5 предметов (массив).
 * У каждого студента есть только 4 оценки – по рандомным 4 предметам (оценки по пятому нет).
 * Необходимо посчитать среднее каждого студента с учетом того,
 * что деление должно быть на 5 (количество предметов), а не на 4 (если использовать стандартный average).
 * Не использовать внешних циклов, все сделать через Stream.
 */
public class Main {
    public static void main(String[] args) {
        String[] subjects = {"Math", "History", "Music", "English", "Geography"};

        Student[] students = {
                new Student("Maria", Map.of("Math", 5, "History", 4, "Music", 5, "English", 4)),
                new Student("Sergey", Map.of("Math", 3, "English", 4, "Music", 5, "Geography", 4)),
                new Student("Petr", Map.of("Geography", 4, "History", 5, "Music", 4, "Math", 4))
        };

        System.out.println(getAverageMarkByStudent(students, subjects));

    }

    public static Map<String, Double> getAverageMarkByStudent(Student[] students, String[] subjects) {
        return Arrays.stream(students)
                .collect(Collectors.toMap
                        (Student::getName,
                                x -> x.getMarks()
                                        .values()
                                        .stream()
                                        .mapToDouble(Integer::doubleValue)
                                        .sum()/ subjects.length));

    }
}
