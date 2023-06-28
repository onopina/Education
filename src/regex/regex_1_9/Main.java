package regex.regex_1_9;

/**
 * 9.	Написать валидатор для URL. Начинаться может как с www, так и с http (s).
 * Заканчиваться может только на ru или com.
 */
public class Main {
    public static void main(String[] args) {
        String url = "https://www.eurosport.com";

        boolean check = url.matches("(https?://|www)[-A-Za-z0-9+&@#/%?=~_|!:,.;]*\\.(ru|com)");
        System.out.println(check);
    }
}
