package regex.regex_2_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1.	Дана строка, состоящая из текста и цифр. Заменить все цифры на («[цифра]»).
 * Должны находиться также и отрицательные числа.
 * Написать двумя способами.
 */
public class Main {
    public static void main(String[] args) {
        String st = "The temperature in Moscow varies from -15°C to 20°C during the year";
        Pattern pattern = Pattern.compile("-?\\d");
        Matcher matcher = pattern.matcher(st);
        String result = matcher.replaceAll("[number]");

        String result1 = st.replaceAll("-?[0-9]", "[number]");

        System.out.println(result);
        System.out.println(result1);
    }
}
