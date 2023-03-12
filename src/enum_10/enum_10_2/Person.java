package enum_10.enum_10_2;

public class Person {

    private String name;
    private int age;
    private Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "name " + name + ", age " + age + ", gender " + gender;
    }
}
