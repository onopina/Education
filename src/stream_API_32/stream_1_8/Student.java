package stream_API_32.stream_1_8;

import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private Map<String, List<Integer>> marks;

    public Student(String name, Map<String, List<Integer>> marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public Map<String, List<Integer>> getMarks() {
        return marks;
    }
}
