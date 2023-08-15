package io_nio.io.io_1_12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 12.	Исправить ошибку считывания русского текста, используя FileInputStream
 * (не буфферизированный, readAllBytes использовать нельзя, read(byte[]) также использовать нельзя).
 */
public class Main {
    public static void main(String[] args) {
        try(InputStreamReader is = new InputStreamReader(new FileInputStream("C:\\Users\\Алина\\IdeaProjects\\Education\\src\\io_nio\\io\\io_1_12\\homework.txt"))){
            int c;
            while ((c = is.read()) != -1){
                System.out.print((char) c);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
