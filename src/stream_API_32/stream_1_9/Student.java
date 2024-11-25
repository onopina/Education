package stream_API_32.stream_1_9;

import java.util.Arrays;

public class Student {
    private int ID;
    private String mane;
    private String surname;
    private int[] marks;

    public Student(int ID, String mane, String surname, int[] marks) {
        this.ID = ID;
        this.mane = mane;
        this.surname = surname;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", mane='" + mane + '\'' +
                ", surname='" + surname + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
