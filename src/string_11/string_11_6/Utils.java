package string_11.string_11_6;

/**
 * 6.	Создать строку из повторяющейся последовательности: 123123123…
 * Далее – удалить из строки все «3», но кроме первой.
 * Реализовать программу двумя способами: с помощью методов String, с помощью методов StringBuilder.
 */
public class Utils {

    public String createSequence(String string, int number) {
        return string.repeat(number);
    }

    public void deleteSymbols(char symbol, String sequence){
        int index = sequence.indexOf(symbol);
        String temp = sequence.substring(0, index+1);
        sequence = sequence.substring(index+1);
        while (sequence.contains(String.valueOf(symbol))){
            index = sequence.indexOf(symbol);
            sequence = sequence.substring(0, index) + sequence.substring(index+1);
        }
        sequence = temp + sequence;
        System.out.println(sequence);
    }
}


