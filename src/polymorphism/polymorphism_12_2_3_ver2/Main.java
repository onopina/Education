package polymorphism.polymorphism_12_2_3_ver2;

public class Main {
    public static void main(String[] args) {
        Formula1 formula1 = new Formula1(2);
        Formula2 formula2 = new Formula2(3);
        Formula3 formula3 = new Formula3(5);
        System.out.println(Evaluator.evaluate(formula1));
        System.out.println(Evaluator.evaluate(formula2));
        System.out.println(Evaluator.evaluate(formula3));
    }
}
