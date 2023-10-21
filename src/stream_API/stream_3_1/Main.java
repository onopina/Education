package stream_API.stream_3_1;

import java.util.*;
import java.util.stream.Collectors;

/**
 1.	Дан массив студентов с оценками по предметам. Найти (необходимо получить Map):
 •	Найти среднее каждого студента по предметам;
 •	Найти среднее по предмету среди всех студентов;
 •	Найти среднее среди всех студентов по всем предметам (общее среднее);
 •	Посчитать «оценку» студента, исходя из его общего количества баллов: 0-7 – bad, 8-15 – normal, 16+ - good.
 •	Получить String – название самого легкого предмета среди студентов.
 •	Получить String – самого умного студента.
 */
public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Maria", Map.of("Math", List.of(5, 5, 4), "History", List.of(4, 3, 5), "Music", List.of(5, 5, 5))),
                new Student("Sergey", Map.of("Math", List.of(4, 4, 3), "History", List.of(5, 4, 5), "Music", List.of(4, 5, 4))),
                new Student("Petr", Map.of("Math", List.of(4, 5, 5), "History", List.of(2, 3, 3), "Music", List.of(3, 5, 4)))
        };

        System.out.println(getAverageMarkByStudent(students));

        System.out.println(getAverageMarkBySubject(students));

        System.out.println(getGeneralAverage(students));

        System.out.println(getGeneralEvaluationByStudent(students));

        System.out.println(getTheEasiestSubject(students));

        System.out.println(getTheSmartestStudent(students));
    }

    public static Map<String, Double> getAverageMarkByStudent(Student[] students){
        return Arrays.stream(students)
                .collect(Collectors.toMap
                        (Student::getName,
                                x -> x.getMarks()
                                .values()
                                .stream().flatMap(Collection::stream)
                                        .mapToInt(z -> z)
                                        .average()
                                        .getAsDouble()));
    }

    public static Map<String, Double> getAverageMarkBySubject(Student[] students){
        return Arrays.stream(students)
                .flatMap(x -> x.getMarks().entrySet().stream())
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.averagingDouble(y -> y.getValue()
                                .stream()
                                .mapToInt(z -> z)
                                .average()
                                .getAsDouble())));
    }

    public static double getGeneralAverage(Student[] students){
        return Arrays.stream(students)
                .flatMapToDouble(x -> x.getMarks()
                        .values()
                        .stream()
                        .flatMap(Collection::stream)
                        .mapToDouble(Integer::doubleValue))
                        .average()
                        .getAsDouble();
    }

    public static Map<String, String> getGeneralEvaluationByStudent(Student[] students){
        Map<String, Integer> map = Arrays.stream(students)
                .collect(Collectors.groupingBy(
                        Student::getName,
                        Collectors.summingInt(x -> x.getMarks()
                                .values()
                                .stream()
                                .flatMap(Collection::stream)
                                .mapToInt(y -> y)
                                .sum())));

        Map<String, String> result = map
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        y -> evaluateMarkToString(y.getValue())));
        return result;
    }

    public static String evaluateMarkToString(int mark){
        String result = null;
        if (mark >= 0 && mark <= 7){
            result = "Bad";
        } else if (mark > 7 && mark <= 15){
            result = "Normal";
        } else if (mark > 15) {
            result = "Good";
        }
        return result;
    }

    public static String getTheEasiestSubject(Student[] students){
        return getAverageMarkBySubject(students)
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
    }

    public static String getTheSmartestStudent(Student[] students){
        return getAverageMarkByStudent(students)
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
    }
}
