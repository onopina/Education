package conditions_2;

/**
 * 1.	Вывести на экран «true», если переменная char принадлежит диапазону 0-9. Иначе «false».
 */
public class HW1_1_1 {
    public static void main(String[] args) {
        char c = '8';
        int n = c - '0';
        boolean bool = n >= 0 && n <= 9;
        System.out.println(bool);
    }
}
