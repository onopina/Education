package io_nio.io.io_1_6;

import java.io.*;

/**
 * 6.	Дана матрица типа int. Записать ее в правильном виде в файл. Далее – считать матрицу из файла.
 */
public class Main {
    public static void main(String[] args) {
        try(DataOutputStream os = new DataOutputStream(new FileOutputStream("homework.txt"))){
            int[][] arr = {{3, 6, 9}, {2, 4, 6}, {1, 2, 3}};
            os.writeInt(arr.length);  //write a number of rows
            os.writeInt(arr[0].length);  //write a number of columns
            os.writeChar('\n');

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    os.writeInt(arr[i][j]);
                    os.writeChar(' ');
                }
                os.writeChar('\n');
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        try(DataInputStream is = new DataInputStream(new FileInputStream("homework.txt"))){
            int rows = is.readInt();
            int columns = is.readInt();
            is.readChar();

            int[][] arr = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    arr[i][j] = is.readInt();
                    System.out.print(arr[i][j]);
                    System.out.print(is.readChar());
                }
                System.out.println(is.readChar());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
