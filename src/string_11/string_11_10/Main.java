package string_11.string_11_10;

/**
 * 10.	Дана строка. Удалить из нее первые N вхождений заданного символа.
 * Пример: удалить 3 единицы: 12122111 ->  22211 (удалено 3 единицы с начала).
 */
public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();
        utils.deleteNumberOfSymbols("12122111", '1', 3);
    }
}
