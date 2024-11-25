package io_nio_29_30.nio.nio_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * 4.	Дана матрица int[][].
 * Записать ее в файл с помощью Files, далее – воссоздать матрицу, считав ее из файла с помощью класса Files.
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{5, 10, 15}, {25, 30, 35}};

        List<String> list = new ArrayList<>();

        list.add(String.valueOf(matrix.length));  //write a number of rows
        list.add(String.valueOf(matrix[0].length));  //write a number of columns

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                list.add(String.valueOf(matrix[i][j]));
            }
        }

        Path path = Paths.get("Matrix.bin");

        try{
            if(!Files.exists(path)){
                Files.write(path, list, StandardOpenOption.CREATE);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        try{
            List<String> listRead = Files.readAllLines(path);
            int rows = Integer.parseInt(listRead.get(0));
            int columns = Integer.parseInt(listRead.get(1));
            int[][] matrixRead = new int[rows][columns];
            int startIndex = 2;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrixRead[i][j] = Integer.parseInt(listRead.get(startIndex));
                    System.out.print(matrixRead[i][j] + " ");
                    startIndex++;
                }
                System.out.println();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
