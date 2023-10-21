package stream_API.stream_2_1;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

/**
 * 1.	Реализовать алгоритмы: поиск максимума, поиск суммы, поиск среднего значения.
 * В случае, если найти решение невозможно, использовать Optional.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 10, 25, -15, 0, -30, 35);

        getMax(list).ifPresentOrElse(x -> System.out.println("The max number in the list is " + x),
                () -> System.out.println("The list is empty"));

        getSum(list).ifPresentOrElse(x -> System.out.println("The sum of the numbers in the list is " + x),
                () -> System.out.println("The list is empty"));

        getAverage(list).ifPresentOrElse(x -> System.out.println("The average of the numbers in the list is " + x),
                () -> System.out.println("The list is empty"));
    }

    public static Optional<Integer> getMax(List<Integer> list) {
        return list
                .stream()
                .max(Integer::compare);
    }

    public static Optional<Integer> getSum(List<Integer> list) {
        return list
                .stream()
                .reduce(Integer::sum);
    }

    public static OptionalDouble getAverage(List<Integer> list){
        return list
                .stream()
                .mapToInt(Integer::valueOf)
                .average();
    }


}

