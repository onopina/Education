package lambda_31.lambda_1_6;

import java.util.function.UnaryOperator;

/**
 * 6.	Написать метод, который возвращает реализацию UnaryOperator.
 * Реализация должна увеличить на единицу параметр метода UnaryOperator<Integer> increment(int param).
 */
public class Main {
    public static void main(String[] args) {
        int element = 10;

        System.out.println(operate(x -> x+1, element));
    }

    public static int operate(UnaryOperator<Integer> operator, int element){
        return operator.apply(element);
    }
}
