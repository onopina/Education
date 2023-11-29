package annotations_reflection.reflection.reflection_2_7;

import java.io.*;
import java.lang.reflect.Field;
import java.util.List;

/**
 * Часть 7:
 * Дан список любых объектов.
 * Необходимо записать такой список в файл в формате: первая строка – заголовки, следующие N строк – значения полей объектов списка.
 * Метод должен принимать только List<T>.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("Maria", "Female", 25),
                new Person("Michael", "Male", 27),
                new Person("Irina", "Female", 23));

        writeToFile(list);
    }

    public static <T> void writeToFile(List<T> list){
        T elem = list.get(0);
        Class<?> cl = elem.getClass();

        Field[] fields = cl.getDeclaredFields();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Алина\\IdeaProjects\\Education\\src\\annotations_reflection\\reflection\\reflection_2_7\\homework.txt", true))) {
            for (Field field : fields) {
                bw.write(field.getName());
                bw.write(" ");
            }
            bw.newLine();
            for (int i = 0; i < list.size(); i++) {
                for (Field field : fields) {
                    field.setAccessible(true);
                    bw.write(field.get(list.get(i)).toString());
                    bw.write(" ");
                }
                bw.newLine();
            }
        } catch (IOException | IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
