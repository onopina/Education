package abstraction_10_11.abstraction_10_3;

public abstract class Employee {
    public String name;
    public int age;
    public int experience;

    public Employee(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public void makeReport(){
        System.out.println("The report is done");
    }

}
