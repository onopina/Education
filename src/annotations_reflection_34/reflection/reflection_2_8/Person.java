package annotations_reflection_34.reflection.reflection_2_8;

public class Person {
    private String name;
    private String gender;
    private Animal animal;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", animal=" + animal +
                '}';
    }
}
