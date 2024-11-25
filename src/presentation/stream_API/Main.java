package presentation.stream_API;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Ann", new int[]{4, 4, 5}),
                new Student("Mike", new int[]{3, 4, 5}),
                new Student("Bart", new int[]{2, 5, 5}),
        };

        Stream<Student> studentsWithout3 = Arrays.stream(students).
                filter(x -> Arrays.stream(x.getMarks()).noneMatch(y -> y==3));

        studentsWithout3.forEach(System.out::println);






    }

}
