package lambda_31.lambda_2_3;

import java.util.Arrays;
import java.util.List;

/**
 * 3.	*Если номер 2 решен через switch или if-else, то переделать без их использования.
 */
public class Main {
    public static void main(String[] args) {
        final int element = 100;
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.forEach(x -> System.out.println("The element is " + element + ". Method # " + x));
    }
}
