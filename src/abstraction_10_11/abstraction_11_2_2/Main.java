package abstraction_10_11.abstraction_11_2_2;

/**
 * 2.	Дан абстрактный класс, интерфейс или обычный класс (выбрать) Matrix.
 *  Необходимо добавить следующие методы: сумма всех элементов матрицы,
 *  среднее значение всех элементов матрицы, получение i-ой строки матрицы в виде массива.
 */
public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(new int[][] {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12,13}});
        System.out.println(matrix.sumMatrix());
        System.out.println(matrix.averageMatrix());
        matrix.getRow(4);
    }
}
