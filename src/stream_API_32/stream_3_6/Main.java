package stream_API_32.stream_3_6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 6.	Создать массив на 10 миллионов элементов.
 * Подсчитать время: 1) сортировки, 2) суммирования, 3) группировки (любой вариант).
 * Операции должны замеряться 2 раза – в обычном потоке, в параллельном потоке.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = Stream.iterate(1, x -> new Random().nextInt(-100, 100))
                .limit(10000000)
                .mapToInt(Integer::valueOf)
                .toArray();

        System.out.println("The time of sorting using regular stream is " + measureTime(array, false, (array1, parallel) -> getSorted(array1, parallel)));

        System.out.println("The time of get sum using regular stream is " +  measureTime(array, false, (array1, parallel) -> getSum(array1, parallel)));

        System.out.println("The time of get duplicates using regular stream is " + measureTime(array, false, (array1, parallel) -> getDuplicates(array1, parallel)));

        System.out.println();

        System.out.println("The time of sorting using parallel stream is " + measureTime(array, true, (array1, parallel) -> getSorted(array1, parallel)));

        System.out.println("The time of get sum using parallel stream is " +  measureTime(array, true, (array1, parallel) -> getSum(array1, parallel)));

        System.out.println("The time of get duplicates using parallel stream is " + measureTime(array, true, (array1, parallel) -> getDuplicates(array1, parallel)));

    }

    public static int[] getSorted(int[] array, boolean parallel){
        if (parallel){
            return Arrays.stream(array)
                    .parallel()
                    .sorted()
                    .toArray();
        } else {
            return Arrays.stream(array)
                    .sorted()
                    .toArray();
        }
    }

    public static int getSum(int[] array, boolean parallel){
        if (parallel){
            return Arrays.stream(array)
                    .parallel()
                    .sum();
        } else {
            return Arrays.stream(array)
                    .sum();
        }
    }

    public static Map<Integer, Long> getDuplicates(int[] array, boolean parallel){
        if (parallel){
            return Arrays.stream(array).boxed()
                    .parallel()
                    .collect(Collectors.groupingBy(
                            x -> x,
                            Collectors.counting()));
        } else {
            return Arrays.stream(array).boxed()
                    .collect(Collectors.groupingBy(
                            x -> x,
                            Collectors.counting()));
        }
    }

    public static <T> long measureTime(T array, Boolean parallel, MyFunction<T, Boolean> function){
        long start = System.nanoTime();
        function.process(array, parallel);
        long finish = System.nanoTime() - start;
        return finish;
    }
}

@FunctionalInterface
interface MyFunction<T, Boolean> {
    void process(T array, Boolean parallel);
}