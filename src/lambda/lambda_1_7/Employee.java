package lambda.lambda_1_7;

public class Employee {
    private String name;
    private int age;
    private int ID;

    public Employee(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                '}';
    }
}
