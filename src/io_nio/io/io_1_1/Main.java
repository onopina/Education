package io_nio.io.io_1_1;

import java.io.*;

/**
 * 1.	Создать файл, записать в него текст помощью обычных байтовых потоков.
 * Считать текст из файла с помощью обычных байтовых потоков.
 */
public class Main {
    public static void main(String[] args) {
        String text = "This is an example of text";

        try (OutputStream os = new FileOutputStream("homework.txt")){
            os.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStream is = new FileInputStream("homework.txt")) {
            int c;
            while ((c = is.read()) != -1){
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
