package regex.regex_1_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 3.	Написать шаблон, который ищет все 5-буквенные слова (но состоит только из букв, без цифр и прочего).
 */
public class Main {
    public static void main(String[] args) {
        String st = "Welcome to Java World!";
        Pattern pattern = Pattern.compile("\\b[A-Za-z]{5}\\b");
        Matcher matcher = pattern.matcher(st);

        while (matcher.find()) {
            System.out.println("Expression: " + matcher.group());
            System.out.println("from " + matcher.start() + " to " + matcher.end());
        }
    }
}
