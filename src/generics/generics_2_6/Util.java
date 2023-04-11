package generics.generics_2_6;

import java.util.List;

public class Util {

    public static double compareSumOfLists(List<? extends Number> list1, List<? extends Number> list2){
        double sum1 = 0;
        double sum2 = 0;
        for(Number num : list1){
            sum1 += num.doubleValue();
        }
        for(Number num : list2){
            sum2 += num.doubleValue();
        }
        return Double.compare(sum1, sum2);
    }
}
