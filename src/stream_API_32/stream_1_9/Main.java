package stream_API_32.stream_1_9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 9.	*Дан файл вида:

 Считать весь файл в List<String>. Преобразовать:
 •	В Stream<String> - поток только имен
 •	В Stream<String[]> - поток массивов из 2 элементов (имя и фамилия)
 •	В Stream<Student> - поток студентов с 4 полями (ID, Name, Surname, Marks).
 */
public class Main {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Алина\\IdeaProjects\\Education\\src\\stream_API\\stream_1_9\\Students.txt"))){
            String line;
            while ((line = br.readLine()) != null){
                students.add(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        getStreamOfNames(students).forEach(System.out::println);

        getStreamOfNamesAndSurnames(students).forEach(x -> System.out.println(Arrays.toString(x)));

        getStreamOfStudents(students).forEach(System.out::println);
    }

    public static Stream<String> getStreamOfNames(List<String> list){
        Stream<String> result = list.stream()
                .skip(1)
                .map(x -> Arrays.stream(x.split(" "))
                        .skip(1)
                        .limit(1)
                        .collect(Collectors.joining()));
        return result;
    }

    public static Stream<String[]> getStreamOfNamesAndSurnames(List<String> list){
        Stream<String[]> result = list.stream()
                .skip(1)
                .map(x -> Arrays.stream(x.split(" "))
                        .skip(1)
                        .limit(2)
                        .toArray(size -> new String[size]));
        return result;
    }

    public static Stream<Student> getStreamOfStudents(List<String> list){
        Stream<String[]> streamOfArrays = list.stream()
                .skip(1)
                .map(x -> Arrays.stream(x.split(" "))
                        .toArray(size -> new String[size]));

        Stream<Student> result = streamOfArrays.
                map(x -> new Student
                        (Integer.parseInt(x[0]),
                                x[1],
                                x[2],
                                Arrays.stream(x[3].replaceAll("\\D","")
                                                .split(""))
                                        .mapToInt(Integer::parseInt)
                                        .toArray()));
        return result;
    }
}
