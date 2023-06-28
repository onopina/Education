package regex.regex_1_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 6.	Написать шаблон, ищущий любые слова, но в которых нет дефиса.
 */
public class Main {
    public static void main(String[] args) {
        String st = "Welcome to Jav-aaa World!";
        Pattern pattern = Pattern.compile("\\b(?<!-)\\w+(?!-)\\b");
        Matcher matcher = pattern.matcher(st);

        while (matcher.find()) {
            System.out.println("Expression: " + matcher.group());
            System.out.println("from " + matcher.start() + " to " + matcher.end());
        }
    }
}
