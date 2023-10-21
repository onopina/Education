package stream_API.stream_2_6;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 6.	Сгенерировать последовательность из 10_000 элементов (случайных).
 * Найти: сумму, среднее, количество положительных, количество отрицательных элементов.
 */
public class Main {
    public static void main(String[] args) {
        Supplier<IntStream> intStreamSupplier = () -> Stream.iterate(1, x -> new Random().nextInt(-100, 100))
                .limit(10000)
                .mapToInt(Integer::valueOf);

        System.out.println(getSum(intStreamSupplier.get()));

        System.out.println(getAverage(intStreamSupplier.get()));

        System.out.println(getNumberOfPositiveElements(intStreamSupplier.get()));

        System.out.println(getNumberOfNegativeElements(intStreamSupplier.get()));
    }

    public static int getSum(IntStream stream){
        return stream.sum();
    }

    public static double getAverage(IntStream stream){
        return stream.sum();
    }

    public static int getNumberOfPositiveElements(IntStream stream){
        return (int) stream.filter(x -> x>0)
                .count();
    }

    public static int getNumberOfNegativeElements(IntStream stream){
        return (int) stream.filter(x -> x<0)
                .count();
    }
}
