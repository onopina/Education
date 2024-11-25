package presentation.stream_API;

import java.util.Arrays;

public class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
