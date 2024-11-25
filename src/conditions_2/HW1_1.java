package conditions_2;

/**
 * 1.	Вывести на экран «true», если переменная char принадлежит диапазону 0-9. Иначе «false».
 */
public class HW1_1 {
    public static void main(String[] args) {
        char c = 1;
        boolean bool = c >= 0 && c <= 9;
        System.out.println(bool);
    }
}
