package annotations_reflection_34.reflection.reflection_2_2;

import java.lang.reflect.Field;

/**
 * Часть 2:
 * Дана иерархия наследования Person->Employee->Doctor.
 * Дан объект класса Doctor.
 * Получить через рефлексию поля класса Person, вывести на консоль их значения.
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Doctor doctor = new Doctor("Kate", 35);
        Class<?> clSuper = doctor.getClass().
                getSuperclass().
                getSuperclass();

        Field[] fields = clSuper.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
            System.out.println(field.getType());
            field.setAccessible(true);
            System.out.println(field.get(doctor));
            System.out.println();
        }
    }
}
