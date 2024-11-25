package generics_13.generics_2_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.	Написать метод, который будет выводить любой числовой Список.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        listInt.add(10);
        listInt.add(15);
        listInt.add(20);
        read(listInt);

        List<Number> listNum = new ArrayList<>();
        listNum.add(50);
        listNum.add(50.5);
        listNum.add(504561213575L);
        read(listNum);
    }

    public static void read(List<? extends Number> list){
        System.out.println(list);
    }



}
