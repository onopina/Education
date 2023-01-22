package abstraction.abstraction_10_3;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("Maria", 50, 30);
        HR_Director HR_director = new HR_Director("Make", 35, 15);
        Financial_Director financial_director = new Financial_Director("Kate", 36, 16);
        director.makeReport();
        HR_director.makeReport();
        HR_director.hireEmployee();
        financial_director.makeReport();
        financial_director.makeFinancialPlan();
    }

}
