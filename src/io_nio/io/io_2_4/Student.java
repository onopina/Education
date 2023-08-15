package io_nio.io.io_2_4;

import java.io.Serial;
import java.io.Serializable;
import java.util.Map;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = -5220054742486502959L;
    private String name;
    private String surname;
    private transient Map<String, Integer> scores;

    public Student(String name, String surname, Map<String, Integer> scores) {
        this.name = name;
        this.surname = surname;
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", scores=" + scores +
                '}';
    }



}
