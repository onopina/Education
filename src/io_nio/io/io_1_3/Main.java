package io_nio.io.io_1_3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 3.	Повторить задание 1, но с использованием обычных символьных потоков.
 */
public class Main {
    public static void main(String[] args) {
        String text = "This is an example of text";

        try (FileWriter fw = new FileWriter("homework.txt")){
            fw.write(text);
        } catch (IOException e){
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader("homework.txt")){
            int c;
            while ((c = fr.read()) != -1){
                System.out.print((char)c);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
