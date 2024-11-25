package treeset_treemap_25.treeset_treemap_1_3;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 3.	Дан класс Student (имя, возраст). Использовать данный в TreeSet. Решить возникшую проблему двумя способами.
 */
public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Petr", 18);
        Student st2 = new Student("Maria", 20);
        Student st3 = new Student("Vasya", 20);
        Student st4 = new Student("Olga", 21);
        Student st5 = new Student("Sveta", 19);
        Student st6 = new Student("Sveta", 20);

        Set<Student> setSortedByName = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getName().equals(o2.getName()))
                    return o1.getAge()-o2.getAge();
                return o1.getName().compareTo(o2.getName());
            }
        });

        setSortedByName.add(st1);
        setSortedByName.add(st2);
        setSortedByName.add(st3);
        setSortedByName.add(st4);
        setSortedByName.add(st5);
        setSortedByName.add(st6);

        System.out.println("The List of Students sorted by name: " + setSortedByName);

        Set<Student> setSortedByAge = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAge() == o2.getAge())
                    return o1.getName().compareTo(o2.getName());
                return o1.getAge() - o2.getAge();
            }
        });

        setSortedByAge.add(st1);
        setSortedByAge.add(st2);
        setSortedByAge.add(st3);
        setSortedByAge.add(st4);
        setSortedByAge.add(st5);
        setSortedByAge.add(st6);

        System.out.println("The List of Students sorted by age: " + setSortedByAge);
    }
}
