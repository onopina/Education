package annotations_reflection.reflection.reflection_2_3;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Часть 3:
 * Дан класс со статическим полем и методом.
 * Через рефлексию получить и изменить значение поля; вызвать метод и сохранить его результат.
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Class<Person> cl = Person.class;

        Field[] fields = cl.getDeclaredFields();

        for (Field field : fields){
            field.setAccessible(true);
            System.out.println(field.get(cl));
            field.set(cl, "Nice");
            System.out.println(field.get(cl));
        }

        Method[] methods = cl.getDeclaredMethods();
        String result = null;

        for (Method method : methods){
            method.setAccessible(true);
            result = (String) method.invoke(cl);
        }

        System.out.println(result);
    }
}
