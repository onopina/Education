package abstraction.abstraction_11_2_2;

import java.util.Arrays;
public class Matrix {
    public int[][]matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int sumMatrix(){
        int sumMatrix = 0;
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                sumMatrix += matrix[i][j];
            }
        }
        return sumMatrix;
    }

    public double averageMatrix() {
        double sumMatrix = 0;
        int countElements = 0;
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                sumMatrix += matrix[i][j];
                countElements++;
            }
        }
        return sumMatrix/countElements;
    }

    public void getRow(int row) {

        int[] getRow = new int[matrix[row-1].length];
        for(int i=0; i<matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == row-1) {
                    getRow[j] = matrix[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(getRow));
    }

}
