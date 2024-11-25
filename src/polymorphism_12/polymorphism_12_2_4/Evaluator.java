package polymorphism_12.polymorphism_12_2_4;

public class Evaluator {

    public static int evaluateTotalResult(Polinomial[] polinomials){
        int result = 0;
        for(Polinomial polinomial : polinomials) {
            result += polinomial.evaluate(polinomial.x);
        }
        return result;
    }
}
