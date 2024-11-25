package io_nio_29_30.nio.nio_5;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * 5.	Дан файл. Необходимо добавить две строки в конец данного файла.
 * Реализовать двумя способами: потоки ввода-вывода, класс Files.
 */
public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\Алина\\IdeaProjects\\Education\\src\\io_nio\\nio\\nio_5\\Text.txt";
        String s1 = "\nСтрока";
        String s2 = "\nДобавлена";

        useIO(path, s1, s2);
        useNIO(path, s1, s2);
    }

    public static void useIO(String path, String s1, String s2){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            bw.write(s1);
            bw.write(s2);

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void useNIO(String path, String s1, String s2){
        Path pathToWrite = Paths.get(path);
        try {
            Files.writeString(pathToWrite, s1, StandardOpenOption.APPEND);
            Files.writeString(pathToWrite, s2, StandardOpenOption.APPEND);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
