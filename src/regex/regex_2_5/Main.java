package regex.regex_2_5;

/**
 * 5.	* Изменить задание 4 так, чтобы в пароле не было ни одного восклицательного знака.
 */
public class Main {
    public static void main(String[] args) {
        String password = "Qwerty-123!";

        boolean check = password.matches("^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[-+&@#/%?=~_|:,.;])(?!.*!).{5,20}$");
        System.out.println(check);
    }
}
