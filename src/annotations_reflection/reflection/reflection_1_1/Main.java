package annotations_reflection.reflection.reflection_1_1;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Часть 1:
 * 1.	Дан объект класса.
 * 2.	Вывести общую информацию о всех методах.
 * 3.	Подсчитать общее количество не-void методов в классе;
 * 4.	Вызвать два любых метода – один без параметров, другой – с параметрами.
 * 5.	Вызвать private метод, сохранить и вывести результат.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Daniel", "Sorokin", 35);
        Class<Person> cl = Person.class;

        Method[] methods = cl.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println("Class: " + method.getDeclaringClass());
            System.out.println("Method name: " + method.getName());
            System.out.println("Return type: " + method.getReturnType());
            System.out.println("Parameters: " + Arrays.toString(method.getParameterTypes()));
            System.out.println();
        }

        int numberOfNonVoidMethods = methods.length;
        for (Method method : methods) {
            if (method.getGenericReturnType().toString().equals("void"))
                numberOfNonVoidMethods--;
        }
        System.out.println("The number of non-void methods is " + numberOfNonVoidMethods);

        for (Method method : methods) {
            if (method.getName().equals("getName")) {
                System.out.println(method.invoke(person));
            } else if (method.getName().equals("getAgePlusSomeYears")) {
                System.out.println(method.invoke(person, 5));
            } else if (method.getName().equals("getGeneralInfo")) {
                method.setAccessible(true);
                method.invoke(person);
            }
        }
    }
}
