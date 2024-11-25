package regex_28.regex_2_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 2.	Написать поисковик для URL. Начинаться может как с www, так и с http (s).
 * Заканчиваться может только на ru или com.
 * При этом дан текст, содержащий множество URL, нужно извлечь все
 * (учесть, что в URL может содержаться дефис, но не может содержаться пробел).
 */
public class Main {
    public static void main(String[] args) {
        String url = "https://www.eurosport.com some words http://wimbledon.com some more words www.sports.ru";
        Pattern pattern = Pattern.compile("(https?://|www)[-A-Za-z0-9+&@#/%?=~_|!:,.;]*\\.(ru|com)");
        Matcher matcher = pattern.matcher(url);

        while (matcher.find()) {
            System.out.println("Expression: " + matcher.group());
            System.out.println("from " + matcher.start() + " to " + matcher.end());
        }
    }
}
