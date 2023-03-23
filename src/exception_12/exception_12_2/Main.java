package exception_12.exception_12_2;

/**
 * 2.	Написать методы, в которых может возникнуть ArrayIndexOutOfBoundsException и NullPointerException.
 * Обработать их с помощью механизма исключений.
 */
public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();
        utils.showElementOfArray();
        utils.getSumLengthOfWords();
    }
}
