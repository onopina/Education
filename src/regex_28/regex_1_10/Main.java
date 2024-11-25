package regex_28.regex_1_10;

/**
 * 10.	Написать валидатор для номера банковской карты.
 */
public class Main {
    public static void main(String[] args) {
        String cardNumber = "2345 0123 4567 8910";

        boolean check = cardNumber.matches("[2-6][0-9]{3} ?([0-9]{4} ?){3}");
        System.out.println(check);
    }
}

