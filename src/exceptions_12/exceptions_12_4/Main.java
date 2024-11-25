package exceptions_12.exceptions_12_4;

/**
 * 4.	Написать метод, который принимает время начала (одно целое число) и время конца оповещения.
 * Предусмотреть исключительные (ошибочные) ситуации.
 * В случае ошибочной ситуации бросить исключение с соответствующим сообщением.
 */
public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();
        utils.setUpAlertTime(24, 10);
    }
}
