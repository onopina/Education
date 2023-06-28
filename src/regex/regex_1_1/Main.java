package regex.regex_1_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1.	Написать шаблон, ищущий все 5-буквенные слова.
 */
public class Main {
    public static void main(String[] args) {
        String st = "Welcome to Java World!";
        Pattern pattern = Pattern.compile("\\b\\w{5}\\b");
        Matcher matcher = pattern.matcher(st);

        while (matcher.find()){
            System.out.println("Expression: " + matcher.group());
            System.out.println("from " + matcher.start() + " to " + matcher.end());
        }
    }
}
