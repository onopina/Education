package presentation.generics;

import java.util.ArrayList;
import java.util.List;


public class Main2 {
    public static void main(String[] args) {
        Number num = 100;
        Integer intNum = 200;
        Double d = 10.2;
//        readInt(intNum);

        List<Integer> list = new ArrayList<>();
        List<Number> listNum = new ArrayList<>();
//        list.add(num);
//        list.add(intNum);
//        list.add(d);
        list.add(10);
        list.add(20);
        listNum.add(10);
        listNum.add(20);
//        readList(list);
//        read(list, listNum);
        read2(list);
        System.out.println(sumUpperWildcard(list));
        addLowerWildcard(list);
        addLowerWildcard(listNum);
        addLowerWildcard(new ArrayList<Object>());
        addLowerWildcard(new ArrayList<Integer>());



    }

//    public static void readInt(Integer num){
//        System.out.println(num);
//    }

    public static void readList(List<? extends Number> list){
        System.out.println(list);
    }

//    public static void readAndWrite(List<?> list){
//        list.set(0, list.get(0));    //error
//    }

    public static void readAndWrite(List<?> list){
        helper(list);
    }

    public static <T> void helper(List<T> list){
        list.add(list.get(0));
    }

//    public static <T> void readAndWriteT(List<T> list){
//        list.add(list.get(0));      //no error
//    }
    public static void read2(List<? extends Number> list){
        for(Number n : list){
            System.out.println(n);
        }
    }

    public static double sumUpperWildcard(List<? extends Number> list){
        double sum = 0;
        for(Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void addLowerWildcard(List<? super Integer> list){
        list.add(10);
        list.set(0, 200);
        list.add(0, 300);
        System.out.println(list.get(0));
        System.out.println(list);
    }

//    public static void readLowerWildcard(List<? super Integer> list){
//        for(Integer n : list){
//            System.out.println(n);
//        }
//    }

    public static <T> void read(List<T> list1, List<T> list2){
        System.out.println(list1);
        System.out.println(list2);
    }
}
