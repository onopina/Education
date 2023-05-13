package lists.lists.lists_1;

import java.util.List;
import java.util.Objects;

public class Util {
    public static double getSumOfElements(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }
    public static double getSumOfEvenElements(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            if (num.doubleValue() % 2 == 0) {
                sum += num.doubleValue();
            }
        }
        return sum;
    }
    public static int getNumberOfRepeatOfElement(List<? extends Number> list, Number value){
        int result = 0;
        for (Number num : list){
            if (Objects.equals(num, value)){
                result++;
            }
        }
        return result;
    }
}
