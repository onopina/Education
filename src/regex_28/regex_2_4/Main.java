package regex_28.regex_2_4;

/**
 * 4.	Написать валидатор для пароля: хотя бы одна цифра, хотя бы один спецсимвол,
 * хотя бы одна заглавная и строчная буква, количество символов – от 5 до 20.
 */
public class Main {
    public static void main(String[] args) {
        String password = "Qwerty-123";

        boolean check = password.matches("^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[-+&@#/%?=~_|!:,.;]).{5,20}$");
        System.out.println(check);
    }
}
