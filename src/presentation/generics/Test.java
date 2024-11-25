package presentation.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

//        ListExample<Integer> list = new ListExample<>(new Integer[]{5, 10});
//        list.insert(5);

        List<String> list1 = new ArrayList<>();
        fill(list1, "word");
        System.out.println(list1);

//        Integer number = 100;
//        unbox(number);

//         List<Integer> list = new ArrayList<>();
//         list.add(10);

         // Классы-обертки (Автоупаковка) //

         Integer intNum = 10;         //int
         Double d = 10.0;             //double
         Character c = 'c';           //char
         Boolean bool = true;         //boolean
         Long l = 545454212121L;      //long

//        int num = 10;
//        Integer autoboxInt = num;
//        Integer autoboxInt1 = 20;
//
//        System.out.println(Integer.MAX_VALUE);
//        String numberStr = "100";
//        System.out.println(Integer.parseInt(numberStr));


//         List rawList = new ArrayList();
//         rawList.add("String1");
//         rawList.add("String2");
     //    rawList.add(10);

//         for(Object str : rawList){
//             String newStr = ((String) str).toUpperCase();
//             System.out.println(newStr);
//         }

    }

    public static int unbox (int i){
        Integer num = i;
        System.out.println(num);
        return num;
    }

    public static <T> void fill (List<T> list, T value){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, value);
        }
    }

    public static <T1, T2> void fill1(List<T1> list, T2 value) {

    }



}

