package exception_12.exception_12_3;

/**
 * 3.	Создать класс Человек, у которого есть следующие поля: Имя, возраст.
 * Предусмотреть недопустимые ситуации для конструкторов и сеттеров полей.
 * Бросить исключения при ошибке.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Max Burtov", -5);
        person.setName("Max");
        person.setAge(35);
    }
}
