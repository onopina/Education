package annotations_reflection.reflection.reflection_2_5;

import java.util.List;
import java.util.stream.IntStream;

@MyAnno(name = "Max", age = 21, marks = {4, 5, 5, 5})
public class Student {
    private String name;
    private int age;
    private List<Integer> marks;

    public Student() {
        Class<Student> cl = Student.class;

        MyAnno myAnno = cl.getAnnotation(MyAnno.class);

        this.name = myAnno.name();
        this.age = myAnno.age();
        this.marks = IntStream.of(myAnno.marks()).boxed().toList();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }
}
