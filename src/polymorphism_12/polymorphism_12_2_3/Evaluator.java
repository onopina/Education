package polymorphism_12.polymorphism_12_2_3;

import java.util.Scanner;

public class Evaluator {

    public static void evaluateFormula(int x){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose the Formula 1, 2 or 3: ");
        int input = scanner.nextInt();
        switch (input){
            case 1 -> {
                Formula1 formula = new Formula1();
                formula.evaluate(x);
            }
            case 2 -> {
                Formula2 formula = new Formula2();
                formula.evaluate(x);
            }
            case 3 -> {
                Formula3 formula = new Formula3();
                formula.evaluate(x);
            }
            default -> System.out.println("The incorrect choice");
        }

    }
}
