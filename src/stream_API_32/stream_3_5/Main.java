package stream_API_32.stream_3_5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * 5.	Создать вручную начальную папку с файлами и другими папками (тоже с файлами).
 * Считать все файлы из начальной папки (включая вложенные во внутренние папки),
 * объединить их в одни итоговый файл.
 * Подсказка: использовать Files.walk.
 */
public class Main {
    public static void main(String[] args) {
        String rootDirectory = "C:\\Users\\Алина\\IdeaProjects\\Education\\src\\stream_API\\stream_3_5\\Root";

        try (Stream<Path> pathStream = Files.walk(Paths.get(rootDirectory))){
            pathStream.filter(Files::isRegularFile)
                    .forEach(System.out::println);
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
