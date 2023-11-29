package annotations_reflection.reflection.reflection_2_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Часть 6:
 * Дан любой файл с любыми заголовками (полями) и любым количеством строк (значений полей). Заголовки именуются с большой буквы.
 * Необходимо написать метод, позволяющий прочитать такой файл и вернуть List<T> - список любого типа.
 * Метод принимает два параметра – название файла и Class<T> (класс, в список объектов которого нужно преобразовать список).
 * Должно работать для полей следующих типов: все примитивы, строки, LocalDate, LocalTime, LocalDateTime.
 */
public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        System.out.println(getList("C:\\Users\\Алина\\IdeaProjects\\Education\\src\\annotations_reflection\\reflection\\reflection_2_6\\Students.txt", Student.class));
    }

    public static <T> List<T> getList(String fileName, Class<T> cl){
        List<T> result = new ArrayList<>();

        try {
            Constructor<T> constructor = cl.getDeclaredConstructor();
            T newObject;
            Field[] fields = cl.getDeclaredFields();

            try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
                br.readLine();  //read the first line
                String line;
                String[] splitLine;
                while ((line = br.readLine()) != null) {
                    splitLine = line.split(" ");
                    newObject = constructor.newInstance();
                    result.add(newObject);
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setAccessible(true);
                        if (fields[i].getType() == Integer.class){
                            fields[i].set(newObject, Integer.valueOf(splitLine[i]));
                        } else if (fields[i].getType() == LocalDate.class){
                            fields[i].set(newObject, LocalDate.parse(splitLine[i]));
                        } else {
                            fields[i].set(newObject, splitLine[i]);
                        }
                    }
                }

            } catch (IOException e){
                e.printStackTrace();
            }

        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e){
            e.printStackTrace();
        }
        return result;
    }
}
