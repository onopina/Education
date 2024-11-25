package string_11.string_11_7;

import java.util.Arrays;

public class Utils {
    public void convertIntToString(int[] numbers){
        String result = Arrays.toString(numbers).replaceAll("\\[|]","").replaceAll(",", "");
        System.out.println(result);
    }
}
