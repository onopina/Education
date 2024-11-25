package hashSet_24.hashSet_1;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int[] scores;

    public Student(String name, int age, int[] scores) {
        this.name = name;
        this.age = age;
        this.scores = scores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Arrays.equals(scores, student.scores);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, age);
        result = 31 * result + Arrays.hashCode(scores);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }
}
