package hashSet.hashSet_6;

import java.util.HashSet;
import java.util.Set;

/**
 * 6.	* Написать программу, в которой «теряется» элемент в HashSet –
 * его больше не удается найти, хотя он там есть.
 * Определить условие, при котором достигается такая ситуация.
 */
public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Student st1 = new Student("Max", 20, 3);
        students.add(st1);
        st1.course = 4;
        System.out.println(students.contains(st1));
        System.out.println(students);
        students.add(st1);
        System.out.println(students.contains(st1));
        System.out.println(students.size());
    }
}
