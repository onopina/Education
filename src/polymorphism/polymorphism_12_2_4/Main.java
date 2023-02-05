package polymorphism.polymorphism_12_2_4;

public class Main {
    public static void main(String[] args) {
        Formula1 formula1 = new Formula1(1);
        Formula2 formula2 = new Formula2(3);
        Formula3 formula3 = new Formula3(5);

        Polinomial[] polinomials = {formula1, formula2, formula3};

        System.out.println(Evaluator.evaluateTotalResult(polinomials));
    }
}
