package regex_28.regex_1_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 4.	Переписать пример, находящий все числа (и дроби тоже), но с помощью другого синтаксиса (подумать, как).
 */
public class Main {
    public static void main(String[] args) {
        String st = "There are 3 fractional numbers: 7.5, -4,65 and 1/2";
        Pattern pattern = Pattern.compile("-?\\d+([.,/]\\d+)?");
        Matcher matcher = pattern.matcher(st);

        while (matcher.find()) {
            System.out.println("Expression: " + matcher.group());
            System.out.println("from " + matcher.start() + " to " + matcher.end());
        }
    }
}
