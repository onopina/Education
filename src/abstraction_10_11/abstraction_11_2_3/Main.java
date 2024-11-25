package abstraction_10_11.abstraction_11_2_3;

/**
 * 3.	Написать абстрактный класс или интерфейс Потребитель (Consumer).
 *  Написать метод, принимающий два параметра int, и третий параметр String.
 *  Параметр String (третий) определяет действие, производимое с числами (+, -, *, /).
 *  Создать класс ArithmeticConsumer, реализующий интерфейс или наследующий абстрактный класс.
 */
public class Main {
    public static void main(String[] args) {
        ArithmeticConsumer result = new ArithmeticConsumer();
        System.out.println(result.getResult(3, 5, "/"));
    }
}
