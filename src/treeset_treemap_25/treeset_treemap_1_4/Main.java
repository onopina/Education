package treeset_treemap_25.treeset_treemap_1_4;

import java.util.Set;
import java.util.TreeSet;

/**
 * 4.	Переписать программу из 3 пункта так, чтобы сортировка производилась в порядке убывания возраста.
 * Если возраста совпадают, то выводить в алфавитном порядке по имени.
 */
public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Petr", 18);
        Student st2 = new Student("Maria", 20);
        Student st3 = new Student("Vasya", 20);
        Student st4 = new Student("Olga", 21);
        Student st5 = new Student("Sveta", 19);
        Student st6 = new Student("Sveta", 20);
        Student st7 = new Student("Sveta", 20);

        Set<Student> students = new TreeSet<>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);
        students.add(st7);

        System.out.println(students);
    }
}
