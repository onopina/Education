package polymorphism_12.polymorphism_12_2_4;

/**
 * Часть 4:
 *  Создать массив объектов разных классов из 3 части.
 *  Написать метод, подсчитывающий общий результат вычисления всех значений формул.
 */
 public class Main {
    public static void main(String[] args) {
        Formula1 formula1 = new Formula1(1);
        Formula2 formula2 = new Formula2(3);
        Formula3 formula3 = new Formula3(5);

        Polinomial[] polinomials = {formula1, formula2, formula3};

        System.out.println(Evaluator.evaluateTotalResult(polinomials));
    }
}
