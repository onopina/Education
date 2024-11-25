package abstraction_10_11.abstraction_10_3;

/**
 * 3.	Реализовать цепочку наследования: Директор, Директор по персоналу, Финансовый директор.
 *  Определить методы: сделать отчет, нанять работника, подготовить финансовый план.
 *  Определить поля: имя, возраст, опыт работы.
 */
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
