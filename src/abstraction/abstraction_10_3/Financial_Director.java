package abstraction.abstraction_10_3;

public class Financial_Director extends Employee {
    public Financial_Director(String name, int age, int experience) {
        super(name, age, experience);
    }
    public void makeFinancialPlan() {
        System.out.println("The financial plan is made");
    }
}


