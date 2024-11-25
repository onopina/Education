package io_nio_29_30.io.io_1_9;

import java.io.*;

/**
 * 9.	Дан двумерный массив double. Записать в файл следующую структуру (ряд – строка матрицы):
 */
public class Main {
    public static void main(String[] args) {
        try(DataOutputStream os = new DataOutputStream(new FileOutputStream("homework.txt"))){
            double[][] arr = {{1, 100, 32.32}, {2, 203, 46.98}, {3, 208, 27.25}, {4, 301, 49.51}, {5, 101, 41.09}};
            os.writeInt(arr.length);  //write a number of rows
            os.writeInt(arr[0].length);  //write a number of columns
            os.writeChar('\n');

            double sum = 0;  //get a sum
            for (int i = 0; i < arr.length; i++) {
                    sum += arr[i][1];
            }

            double average = 0;  //get an average
            for (int i = 0; i < arr.length; i++) {
                average += arr[i][2];
            }
            average = average/arr.length;

            os.writeUTF("Ряд Сумма Среднее\n");

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    os.writeDouble(arr[i][j]);
                    os.writeChar(' ');
                }
                os.writeChar('\n');
            }
            os.writeUTF("Количество элементов: " + arr.length + "\n" +
                    "Сумма элементов: " + sum + "\n" +
                    "Среднее всех элементов: " + average + "\n");

        } catch (IOException e){
            e.printStackTrace();
        }

        try(DataInputStream is = new DataInputStream(new FileInputStream("homework.txt"))) {
            int rows = is.readInt();
            int columns = is.readInt();
            is.readChar();

            String header = is.readUTF();
            System.out.println(header);

            double[][] arr = new double[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    arr[i][j] = is.readDouble();
                    System.out.print(arr[i][j]);
                    System.out.print(is.readChar());
                }
                System.out.println(is.readChar());
            }

            String summary = is.readUTF();
            System.out.println(summary);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
