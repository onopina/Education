package hashSet.hashSet_1;

import java.util.HashSet;
import java.util.Set;

/**
 * 1.	Реализовать класс Студент с полями: имя, возраст, оценки (массив int).
 * Использовать класс в классе HashSet (проверить уникальность).
 */
public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Max", 21, new int[]{5, 4, 5, 3, 5}));
        students.add(new Student("Alisa", 18, new int[]{4, 5, 5, 2, 2}));
        students.add(new Student("Fedor", 19, new int[]{4, 4, 5, 5, 3}));
        students.add(new Student("Elizaveta", 20, new int[]{5, 4, 5, 5, 5}));
        students.add(new Student("Max", 21, new int[]{5, 4, 5, 3, 5}));  //duplicate

        System.out.println(students);

        System.out.println("The number of students is " + students.size());
    }
}
