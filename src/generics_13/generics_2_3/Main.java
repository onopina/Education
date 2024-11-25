package generics_13.generics_2_3;

import java.util.ArrayList;
import java.util.List;

/**
 * 3.	Написать метод, который будет считать сумму двух любых числовых списков.
 */
public class Main {
    public static void main(String[] args) {
        List<Double> listDbl = new ArrayList<>();
        listDbl.add(1.5);
        listDbl.add(2.0);
        listDbl.add(2.5);
        List<Number> listNum = new ArrayList<>();
        listNum.add(10);
        listNum.add(15.5);
        listNum.add(25);
        System.out.println(getSumOfLists(listDbl, listNum));
    }

    public static double getSumOfLists(List<? extends Number> list1, List<? extends Number> list2){
        double sum = 0;
        for(Number num : list1){
            sum += num.doubleValue();
        }
        for(Number num : list2){
            sum += num.doubleValue();
        }
        return sum;
    }
}
