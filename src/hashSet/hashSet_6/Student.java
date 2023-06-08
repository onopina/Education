package hashSet.hashSet_6;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    public int course;  //намеренно public, чтобы получить ошибку

    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }
}
