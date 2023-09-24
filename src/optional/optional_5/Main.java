package optional.optional_5;

import java.util.*;
import java.util.stream.IntStream;

/**
 * 5.	Найти среднее массива с помощью StreamApi.
 * Если среднее найти не удается, то вернуть случайное значение от 0 до 10 двумя способами: orElse, orElseGet.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {};

        OptionalDouble result = getAverage(arr);

        System.out.println(result.orElse(getRandom()));

        System.out.println(result.orElseGet(Main::getRandom));
    }
    public static OptionalDouble getAverage(int[] arr){
        IntStream stream = Arrays.stream(arr);
        return stream.average();
    }
    public static int getRandom(){
        Random random = new Random();
        return random.nextInt(11);
    }
}
