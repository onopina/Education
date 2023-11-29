package annotations_reflection.reflection.reflection_2_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Часть 8***:
 * Сделать так, чтобы в 6 задании можно было после считывания файла назначать поля любого типа.
 * Пример: хотим получить List<Person>, но в классе Person есть поле типа Animal.
 * Нужно сделать так, чтобы это не было проблемой
 * (чтобы животное тоже считывалось из файла и назначалось объекту класса Person через рефлексию).
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(getList("C:\\Users\\Алина\\IdeaProjects\\Education\\src\\annotations_reflection\\reflection\\reflection_2_8\\People.txt", Person.class));
    }

    public static <T, Gson> List<T> getList(String fileName, Class<T> cl){
        List<T> result = new ArrayList<>();

        try{
            Constructor<T> constructor = cl.getDeclaredConstructor();
            T newObject;
            Field[] fields = cl.getDeclaredFields();

            try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
                br.readLine();  //read the first line
                String line;
                String[] splitLine;
                while ((line = br.readLine()) != null){
                    splitLine = line.split(" ");
                    newObject = constructor.newInstance();
                    result.add(newObject);
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setAccessible(true);
                        if (fields[i].getType() == Animal.class) {
                            Constructor<Animal> animalConstructor = Animal.class.getDeclaredConstructor();
                            Animal animal = animalConstructor.newInstance();
                            Field[] animalFields = Animal.class.getDeclaredFields();
                            for (Field animalField : animalFields){
                                animalField.setAccessible(true);
                                animalField.set(animal, splitLine[i]);
                            }
                            fields[i].set(newObject, animal);
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
