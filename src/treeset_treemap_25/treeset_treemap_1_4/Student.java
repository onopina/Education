package treeset_treemap_25.treeset_treemap_1_4;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.age == o.age)
            return this.name.compareTo(o.name);
        return o.age - this.age;
    }
}
