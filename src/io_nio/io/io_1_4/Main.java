package io_nio.io.io_1_4;

import java.io.*;

/**
 * 4.	Повторить задание 2, но с использованием буферизированных символьных потоков.
 */
public class Main {
    public static void main(String[] args) {
        String text = "This is an example of text";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("homework.txt"))){
            bw.write(text);
        } catch (IOException e){
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("homework.txt"))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.print(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
