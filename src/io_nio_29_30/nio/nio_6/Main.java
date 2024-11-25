package io_nio_29_30.nio.nio_6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * 6.	Создать файл средствами класса Files.
 * Если файл уже существует, должно автоматически генерироваться исключение (нельзя кидать самостоятельно).
 * Далее записать в файл любой список.
 */
public class Main {
    public static void main(String[] args) {
        List<String> currency = new ArrayList<>();

        currency.add("Dollar");
        currency.add("Euro");
        currency.add("Iena");

        Path path = Paths.get("C:\\Users\\Алина\\IdeaProjects\\Education\\src\\io_nio\\nio\\nio_6\\Currency.txt");

        try{
            Files.write(path, currency, StandardOpenOption.CREATE_NEW);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
