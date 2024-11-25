package exceptions_12.exceptions_12_1;

/**
 * 1.	Написать метод, в котором возникает ArithmeticException. Обработать исключение. Написать блок finally.
 */
public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();
        utils.divide(5, 0);
    }
}
