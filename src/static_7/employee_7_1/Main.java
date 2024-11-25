package static_7.employee_7_1;

/**
 * Часть 1:
 * Создать класс Работник.
 * 1.	Добавить поля: имя, возраст, пол.
 * 2.	Добавить два конструктора: первый – для инициализации трех полей.
 *  Второй – для инициализации имени и пола. Третий – по умолчанию.
 * 3.	Добавить следующую логику: если возраст при создании объекта не задается,
 *  то его необходимо задать по умолчанию (например, в значение 18).
 * 4.	Добавить следующую логику: подсчитать количество объектов, созданных в программе.
 * 5.	Добавить следующую логику: вести статистику количества мужчин и женщин.
 * 6.	Добавить метод, предоставляющий сводку: всего работников создано, из них … женщин, … мужчин.
 */
public class Main {
    public static void main(String[] args) {

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
