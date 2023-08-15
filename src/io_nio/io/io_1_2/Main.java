package io_nio.io.io_1_2;

import java.io.*;

/**
 * 2.	Создать файл, записать в него текст помощью буферизированных байтовых потоков.
 * Считать текст из файла с помощью обычных байтовых потоков.
 */
public class Main {
    public static void main(String[] args) {
        String text = "This is an example of text";

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("homework.txt"))){
            bos.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("homework.txt"))){
            int c;
            while ((c = bis.read()) != -1){
                System.out.print((char)c);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
