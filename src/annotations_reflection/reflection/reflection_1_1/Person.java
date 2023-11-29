package annotations_reflection.reflection.reflection_1_1;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getAgePlusSomeYears(int years){
        return age+years;
    }

    private void getGeneralInfo(){
        System.out.println("The name of the class is Person");
    }
}
