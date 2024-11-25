package generics_13.generics_2_5;

import java.util.ArrayList;
import java.util.List;

/**
 * 5.	Реализовать принцип PECS на примере метода, принимающем два списка
 * (нужно все элементы из одного списка добавить во второй).
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(15);
        list1.add(20);
        List<Integer> list2 = new ArrayList<>();
        list2.add(25);
        list2.add(30);
        list2.add(35);
        splitLists(list1, list2);
    }

    public static <T> void splitLists(List<? extends T> list1, List<? super T> list2){
        for(T num : list1){
            list2.add(num);
        }
        System.out.println(list2);
    }
}
