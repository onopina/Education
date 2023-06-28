package regex.regex_1_5;

/**
 * 5.	Написать валидатор для email:
 * сначала идет последовательность символов от 1 до 10, потом @,
 * потом набор (mail | gmail |yandex), потом точка, в конце – (ru | com).
 */
public class Main {
    public static void main(String[] args) {
        String email = "123@gmail.com";

        boolean check = email.matches("[0-9]+@(mail|gmail|yandex)\\.(ru|com)");
        System.out.println(check);
    }
}
