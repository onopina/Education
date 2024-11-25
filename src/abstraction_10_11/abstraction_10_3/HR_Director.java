package abstraction_10_11.abstraction_10_3;

public class HR_Director extends Employee{
    public HR_Director(String name, int age, int experience) {
        super(name, age, experience);
    }

    public void hireEmployee() {
        System.out.println("The employee is hired");
    }

}
