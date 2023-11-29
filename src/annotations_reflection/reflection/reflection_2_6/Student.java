package annotations_reflection.reflection.reflection_2_6;

import java.time.LocalDate;

public class Student {
    private String name;
    private String gender;
    private Integer age;
    private LocalDate date;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
