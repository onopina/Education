package generics_13.generics_3_3;

/**
 * 3.	Реализовать метод, вычисляющий сумму переданных параметров INT в функцию (использоваться varargs).
 * Также найти максимальный и минимальный элемент.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Util.getSum(15, 25, 50, -20, 30));
        System.out.println(Util.getMin(15, 25, 50, -20, 30));
        System.out.println(Util.getMax(15, 25, 50, -20, 30));
    }
}
