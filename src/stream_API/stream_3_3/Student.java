package stream_API.stream_3_3;

import java.util.Map;

public class Student {
    private String name;
    private Map<String, Integer> marks;

    public Student(String name, Map<String, Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public Student(Map<String, Integer> marks) {
        this.marks = marks;
    }
}

