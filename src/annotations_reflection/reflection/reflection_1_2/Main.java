package annotations_reflection.reflection.reflection_1_2;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Часть 2:
 * 1.	Написать метод, который принимает объект типа T.
 * 2.	Вывести: название класса данного объекта, названия всех методов.
 * 3.	Получить метод equals. Вызвать его и сохранить результат.
 * 4.	*Посчитать количество public методов, посчитать количество всех остальных.
 * 5.	*Посчитать количество private методов класса через getModifiers
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Mark", 19, 3);
        Class<?> result = showInfo(student);

        System.out.println("The name of the class is " + result.getSimpleName());

        System.out.println(result.equals(student.getClass()));

        System.out.println("The number of public methods is " + getNumberOfPublicMethods(result));

        System.out.println("The number of private methods is " + getNumberOfPrivateMethods(result));
    }

    public static <T> Class<T> showInfo(T person){
        return (Class<T>) person.getClass();
    }

    public static <T> int getNumberOfPublicMethods(Class<T> cl){
        Method[] methods = cl.getDeclaredMethods();
        int result = 0;

        for (Method method : methods){
            if (Modifier.toString(method.getModifiers()).equals("public")){
                result++;
            }
        }
        return result;
    }

    public static <T> int getNumberOfPrivateMethods(Class<T> cl){
        Method[] methods = cl.getDeclaredMethods();
        int result = 0;

        for (Method method : methods){
            if (Modifier.toString(method.getModifiers()).equals("private")){
                result++;
            }
        }
        return result;
    }
}
