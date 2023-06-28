package regex.regex_2_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 6.	Дан текст, состоящий из нескольких предложений.
 * Необходимо заменить все точки или запятые на символ новой строки.
 * Посчитать, сколько в итоге строк содержится в тексте.
 */
public class Main {
    public static void main(String[] args) {
        String st = "The Wimbledon Championships, commonly known simply as Wimbledon, is the oldest tennis tournament in the world. It is widely regarded as the most prestigious.";
        Pattern pattern = Pattern.compile("\\.|,");
        Matcher matcher = pattern.matcher(st);

        int counter = 0;

        while (matcher.find()){
            counter++;
        }

        String result = matcher.replaceAll("\n");

        System.out.println(result);
        System.out.println("Tne number of lines in the text is " + (counter));
    }
}
