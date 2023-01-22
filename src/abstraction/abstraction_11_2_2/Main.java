package abstraction.abstraction_11_2_2;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(new int[][] {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12,13}});
        System.out.println(matrix.sumMatrix());
        System.out.println(matrix.averageMatrix());
        matrix.getRow(4);
    }
}
