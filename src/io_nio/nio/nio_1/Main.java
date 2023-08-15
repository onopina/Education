package io_nio.nio.nio_1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1.	Создать любой Map<Integer, String>. Записать (и прочитать) Map в файл, используя
 * 1) потоки ввода-вывода, 2) класс Files
 */
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "Japan");
        map.put(101, "India");
        map.put(102, "China");

        useIO(map);
        useNIO(map);
    }

    public static void useIO(Object obj){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Example.bin"))){
            oos.writeObject(obj);
        } catch (IOException e){
            e.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Example.bin"))){
            Object objRead = ois.readObject();
            System.out.println(objRead);
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static <K, V> void useNIO(Map<K, V> map){
        Path path = Paths.get("Example1.bin");

        List<String> list = new ArrayList<>();

        for (Map.Entry<K, V> pair : map.entrySet()){
            list.add(pair.getKey() + ":" + pair.getValue());
        }

        try{
            Files.write(path, list, StandardOpenOption.CREATE);
        } catch (IOException e){
            e.printStackTrace();
        }

        try{
            List<String> listRead = Files.readAllLines(path);
            Map<K, V> mapRead = new HashMap<>();
            for (String elem : listRead){
                String[] arr = elem.split(":");
                mapRead.put((K) arr[0], (V) arr[1]);
            }
            System.out.println(mapRead);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
