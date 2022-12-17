package Employee_7;

public class Main {
    public static void main(String[] args) {

    //7. Статические поля и методы. Часть 1
        Employee employee1 = new Employee("Maria", "woman");
        employee1.introduce();
        Employee employee2 = new Employee("Max", 25,"man");
        employee2.introduce();
        Employee employee3 = new Employee();
        employee3.name = "Rob";
        employee3.gender = "man";
        employee3.introduce();
        System.out.println("The number of employees is " + Employee.countEmployees);
        System.out.println("The number of women is " + Employee.countWomen);
        System.out.println("The number of men is " + Employee.countMen);
        Employee.summary();
    }
}
