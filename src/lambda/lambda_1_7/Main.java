package lambda.lambda_1_7;

/**
 * 7.	*Написать метод функционального интерфейса, который принимает объект класса Employee.
 * Возвращает строку, которая является преобразованием объекта в текстовый формат JSON.
 */
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Maria", 25, 50);

        System.out.println(func(Employee::toString, emp));
    }

    @FunctionalInterface
    public interface MyFunction<T, R>{
        R apply(T t);
    }

    public static String func(MyFunction<Employee, String> function, Employee emp){
        return function.apply(emp);
    }
}
