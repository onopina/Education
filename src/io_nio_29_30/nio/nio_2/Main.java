package io_nio_29_30.nio.nio_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * 2.	Создать файл с помощью Files.
 * 1) Скопировать данный файл в новую директорию, расположенную в текущем проекте.
 * 2) Переместить файл в новую директорию, расположенную в данном проекте.
 * Решение должно работать, даже если файл уже существует.
 */
public class Main {
    public static void main(String[] args) {

        Path newFile = null;
        try{
            if(!Files.exists(Paths.get("C:\\Users\\Алина\\Desktop\\Test.txt"))){
                newFile = Files.createFile(Paths.get("C:\\Users\\Алина\\Desktop\\Test.txt"));
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        Path directory = Paths.get("C:\\Users\\Алина\\IdeaProjects\\Education\\src\\io_nio\\nio\\nio_2\\TestCopy.txt");

        try{
            Files.copy(newFile, directory, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e){
            e.printStackTrace();
        }

        try {
            Files.createDirectory(Paths.get("C:\\Users\\Алина\\IdeaProjects\\Education\\src\\io_nio\\nio\\nio_2\\new"));
            Path newCopyFile = Paths.get("C:\\Users\\Алина\\IdeaProjects\\Education\\src\\io_nio\\nio\\nio_2\\new\\TestCopy2.txt");
            Files.move(directory, newCopyFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
