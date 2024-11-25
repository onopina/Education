package annotations_reflection_34.reflection.reflection_1_2;

public class Student {
    private String name;
    private int age;
    private int course;

    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    private void getGeneralInfo(){
        System.out.println("This is some general info");
    }
}
