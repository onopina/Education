package stream_API_32.stream_3_4;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 4.	Дана структура Map<String, List<Student>> -
 * список студентов по группам (String – группа, List<Student> - список студентов в группе).
 * Найти:
 * •	Самую сильную группу (группу с наибольшим средним баллом у студентов).
 * •	Самого сильного студента из всех групп.
 * •	Средний балл студентов по группам.
 * •	Получить список всех студентов.
 * •	Получить список всех оценок всех студентов.
 * •	Получить список всех групп, отсортированный по убыванию.
 * •	Проверить: являются ли все в группе отличниками (оценки только 4 или 5, без троек). Определить это для каждой группы.
 */
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Olga", List.of(5, 4, 4));
        Student student2 = new Student("Helen", List.of(5, 5, 4));
        Student student3 = new Student("Petr", List.of(3, 3, 4));
        Student student4 = new Student("Oleg", List.of(4, 5, 4));
        Student student5 = new Student("Alina", List.of(5, 5, 4));
        Student student6 = new Student("Alex", List.of(4, 4, 4));
        Student student7 = new Student("Daria", List.of(5, 4, 5));
        Student student8 = new Student("Sergey", List.of(3, 4, 3));
        Student student9 = new Student("Dmitriy", List.of(5, 5, 3));

        Map<String, List<Student>> allGroups = Map.of(
                "Group #1", List.of(student1, student2, student3),
                "Group #2", List.of(student4, student5, student6),
                "Group #3", List.of(student7, student8, student9)
        );

        System.out.println(getTheSmartiestGroup(allGroups));

        System.out.println(getTheSmartiestStudent(allGroups));

        System.out.println(getAverageMarkByGroup(allGroups));

        System.out.println(getListOfAllStudents(allGroups));

        System.out.println(getListOfAllMarks(allGroups));

        System.out.println(getSortedListOfAllGroups(allGroups));

        System.out.println(checkGroupsByExcellentStudents(allGroups));
    }

    public static String getTheSmartiestGroup(Map<String, List<Student>> allGroups) {
        Map<String, Double> map = allGroups.entrySet().stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.averagingDouble(x -> x.getValue()
                                .stream()
                                .flatMapToInt(z -> z.getMarks()
                                        .stream()
                                        .mapToInt(y -> y))
                                .average()
                                .getAsDouble())));
        return map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
    }

    public static Student getTheSmartiestStudent(Map<String, List<Student>> allGroups) {
        Map<Student, Double> map = allGroups.values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toMap(
                        x -> x,
                        y -> y.getMarks()
                                .stream()
                                .map(Integer::doubleValue).reduce(Double::sum).get()));
        return map.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .get()
                .getKey();
    }

    public static Map<String, Double> getAverageMarkByGroup(Map<String, List<Student>> allGroups) {
        return allGroups.entrySet().stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.averagingDouble(x -> x.getValue()
                                .stream()
                                .flatMapToInt(z -> z.getMarks()
                                        .stream()
                                        .mapToInt(y -> y))
                                .average()
                                .getAsDouble())));
    }

    public static List<Student> getListOfAllStudents(Map<String, List<Student>> allGroups) {
        return allGroups.values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public static List<Integer> getListOfAllMarks(Map<String, List<Student>> allGroups) {
        return allGroups.values().stream()
                .flatMap(x -> x.stream().flatMap(y -> y.getMarks().stream()))
                .collect(Collectors.toList());
    }

    public static List<String> getSortedListOfAllGroups(Map<String, List<Student>> allGroups) {
        return getAverageMarkByGroup(allGroups).entrySet().stream()
                .sorted((x, y) -> y.getValue().compareTo(x.getValue()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static Map<Boolean, List<Map.Entry<String, Integer>>> checkGroupsByExcellentStudents(Map<String, List<Student>> allGroups) {
        Map<String, Integer> map = allGroups.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        y -> y.getValue()
                                .stream()
                                .flatMapToInt(z -> z.getMarks()
                                        .stream()
                                        .mapToInt(x -> x))
                                .min()
                                .getAsInt()));
        return map.entrySet().stream()
                .collect(Collectors.partitioningBy(x -> x.getValue() > 3));
    }
}
