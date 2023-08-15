package io_nio.nio.nio_3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 3.	Изменить задачу из пункта 2 так, чтобы файл удалялся, если он уже существует (а далее создавался заново).
 */
public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\Алина\\Desktop\\Test.txt");
        try{
            if(!Files.exists(path) || Files.deleteIfExists(path)){
                Files.createFile(path);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
