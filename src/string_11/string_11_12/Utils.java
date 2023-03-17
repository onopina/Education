package string_11.string_11_12;

/**
 * 12.	Дано предложение. Получить массив слов, полученных из строки (подсказка: метод split).
 */

public class Utils {
    public void splitSentenceToWords(String sentence){
        int countSpaces = 0;
        char[] chars = sentence.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ')
            countSpaces++;
        }
        String[] word = new String[countSpaces+1];
        for (int i = 0; i <= countSpaces; i++) {
            int index = sentence.indexOf(" ");
            if (i<countSpaces) {
                word[i] = sentence.substring(0, index);
                sentence = sentence.substring(index + 1);
            }
            else word[i] = sentence;
            System.out.println(word[i]);
        }
    }

    public void split(String sentence){
        String[] words = sentence.split(" ");
        for (String word : words){
            System.out.println(word);
        }
    }
}
