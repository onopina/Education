package generics.generics_1_1;

/**
 * 1.	Создать обобщенный класс, хранящий пару «ключ-значение» (два поля). При реализации соблюсти принцип инкапсуляции.
 * Добавить еще один любой метод в класс, выполняющий определенную (любую) логику с полями класса (с ключом и значением).
 */
public class Main {
    public static void main(String[] args) {
        Employee<String, Integer> employee = new Employee<>();
        employee.setName("Tom");
        employee.setAge(25);
        employee.correctEmployee("Tomas", 26);
        System.out.println("The name of Employee is " + employee.getName() + ". The age is " + employee.getAge());
    }
}
