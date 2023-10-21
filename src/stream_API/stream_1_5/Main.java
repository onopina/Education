package stream_API.stream_1_5;

import java.util.Arrays;
import java.util.stream.DoubleStream;

/**
 * 5.	Дана матрица дробных чисел. Получить Stream всех элементов матрицы.
 * Увеличить их в два раза. Вывести на консоль.
 */
public class Main {
    public static void main(String[] args) {
        double[][] matrix = {{4.5, 5.5}, {6.5, 7.5}, {8.5, 9.5}};

        DoubleStream matrixStream = Arrays.stream(matrix)
                .flatMapToDouble(Arrays::stream)
                .map(x -> x*2);

        matrixStream.forEach(System.out::println);
    }
}
