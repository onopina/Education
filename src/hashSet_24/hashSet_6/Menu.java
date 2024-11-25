package hashSet_24.hashSet_6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Menu {
    private Set<Student> students = new HashSet<>();

    public void start(){
        Student st1 = registerNewStudent();
        students.add(st1);
        System.out.println("...Time passed...");
        changeCourseNumber(st1);
        System.out.println("Is " + st1 + " at the List of Students? " + students.contains(st1)); //Здесь ошибка, т.к. объекты в Set должны быть immutable
        System.out.println("The List of Students: " + students);
        System.out.println("...Adding the Student with the new number of course...");
        students.add(st1);
        System.out.println("Now is " + st1 + " at the List of Students? " + students.contains(st1));
        System.out.println("The total number of Students at the List: " + students.size());
    }

    private Student registerNewStudent(){
        System.out.print("Enter a name of new Student: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Enter an age of the Student: ");
        int age = scanner.nextInt();
        System.out.print("Enter a number of course of the Student: ");
        int course = scanner.nextInt();

        Student st = new Student(name, age, course);

        return st;
    }

    private void changeCourseNumber(Student st){
        System.out.print("Enter a new number of course of the Student: ");
        Scanner scanner = new Scanner(System.in);
        int newCourse = scanner.nextInt();
        st.setCourse(newCourse);
    }
}
