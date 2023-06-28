package regex.regex_1_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 7.	Дана строка, содержащая названия файлов («file.txt  file.exe filwfad.zip»).
 * Получить только названия файлов (прочие строки, не являющиеся названиями файлов, должны быть проигнорированы).
 */
public class Main {
    public static void main(String[] args) {
        String st = "book.txt  game.exe  project.pdf  word";
        Pattern pattern = Pattern.compile("\\b\\w+(?=.\\w)\\b");
        Matcher matcher = pattern.matcher(st);

        while (matcher.find()) {
            System.out.println("Expression: " + matcher.group());
            System.out.println("from " + matcher.start() + " to " + matcher.end());
        }
    }
}
