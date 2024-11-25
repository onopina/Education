package generics_13.generics_3_4;

public class Util {
    public static double getSum(Number... numbers){
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i].doubleValue();
        }
        return sum;
    }
}
