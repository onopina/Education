package polymorphism_12.polymorphism_12_2_5;

public class Employee extends Person{

    String job;

    public Employee(String name, String job) {
        super(name);
        this.job = job;
    }

    public void printInfo() {
        System.out.println("PrintInfo from Employee");
        System.out.println(
                name.toUpperCase() + " " + job.toUpperCase()
        );
    }
}
