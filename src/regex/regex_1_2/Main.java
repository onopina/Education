package regex.regex_1_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 2.	Написать шаблон, ищущий все слова от 2 до 5 букв.
 */
public class Main {
    public static void main(String[] args) {
        String st = "Welcome to Java World!";
        Pattern pattern = Pattern.compile("\\b\\w{2,5}\\b");
        Matcher matcher = pattern.matcher(st);

        while (matcher.find()){
            System.out.println("Expression: " + matcher.group());
            System.out.println("from " + matcher.start() + " to " + matcher.end());
        }
    }
}
