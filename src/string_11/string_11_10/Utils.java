package string_11.string_11_10;

/**
 * 10.	Дана строка. Удалить из нее первые N вхождений заданного символа.
 * Пример: удалить 3 единицы: 12122111 ->  22211 (удалено 3 единицы с начала).
 */
public class Utils {
    public void deleteNumberOfSymbols(String string, char symbol, int number){
        int count = 0;
        while (count < number) {
            int index = string.indexOf(symbol);
            string = string.substring(0, index) + string.substring(index+1);
            count++;
        }
        System.out.println(string);
    }
}
