package generics.generics_2_2;

import java.util.ArrayList;
import java.util.List;

/**
 * 2.	Написать метод, который будет возвращать сумму элементов любого числового списка
 * (через wildcard и обобщенный метод)
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(25);
        list.add(50);
        System.out.println(getSum(list));
    }
    public static double getSum(List<? extends Number> list){
        double sum = 0;
        for(Number num : list){
            sum += num.doubleValue();
        }
        return sum;
    }
}
