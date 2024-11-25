package lambda_31.lambda_1_2;

import java.util.ArrayList;
import java.util.List;

/**
 * 2.	Отфильтровать список следующим образом: оставить элементы, только если сумма цифр числа больше 10.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1525);
        list.add(-10);
        list.add(2550);
        list.add(120);
        list.add(-50);

        list.removeIf(x -> getSum(x)<= 10);

        System.out.println(list);
    }

    public static int getSum(int number){
        int sum = 0;
        while (number!=0){
            sum += number%10;
            number /= 10;
        }
        return sum;
    }
}
