package annotations_reflection_34.reflection.reflection_2_1;

import java.lang.reflect.Field;

/**
 * Часть 1:
 * Написать метод, который принимает объект типа Т, а также Object var-arg (аргумент переменной длины).
 * Необходимо во все поля объекта присвоить значения из var-arg.
 * Примечание: все параметры корректные по типы, передаются по порядку следования полей в классе.
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Bus bus = new Bus();
        fillFields(bus, 5, 12, 20);
        System.out.println(bus);
    }

    public static <T, K> void fillFields(T object, K... elements) throws IllegalAccessException {
        Class<?> cl = object.getClass();
        Field[] fields = cl.getDeclaredFields();
        for (int i = 0; i < elements.length; i++) {
            fields[i].setAccessible(true);
            fields[i].set(object, elements[i]);
        }
    }
}
