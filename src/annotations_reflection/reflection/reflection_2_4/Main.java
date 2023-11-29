package annotations_reflection.reflection.reflection_2_4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Часть 4:
 * Дан класс Person. Создать два объекта данного класса с помощью разных конструкторов через рефлексию.
 */
public class Main {
    public static void main(String[] args){
        Class<Person> cl = Person.class;

        try{
            Constructor<Person> constructor1 = cl.getDeclaredConstructor();
            Person person1 = constructor1.newInstance();
            System.out.println(person1);

            System.out.println();

            Constructor<Person> constructor2 = cl.getDeclaredConstructor(String.class, int.class);
            Person person2 = constructor2.newInstance("Mark", 25);
            System.out.println(person2);
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException ex){
            ex.printStackTrace();
        }
    }
}
