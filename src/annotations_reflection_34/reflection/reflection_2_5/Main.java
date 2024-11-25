package annotations_reflection_34.reflection.reflection_2_5;

/**
 * Часть 5:
 * Дан класс Student с полями: name, age, List<Integer> marks.
 * Написать аннотацию, которая будет внедрять значение в поля объекта.
 * Аннотация должна указываться над полем, должно работать внедрение строки, целого числа, списка целых чисел.
 * Логика по внедрению должна работать сразу при создании объекта.
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
    }
}
