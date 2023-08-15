package io_nio.io.io_1_11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 11.	Дано очень большое число (не помещается в int или long), записанное в файле.
 * Считать данное число и разбить его на отдельные цифры.
 * Подсчитать, сколько каждая из цифр входит в число.
 */
public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        try(DataInputStream is = new DataInputStream(new FileInputStream("C:\\Users\\Алина\\IdeaProjects\\Education\\src\\io_nio\\io\\io_1_11\\homework.txt"))){
            int number;
            while ((number = is.read()) != -1){
                Integer count = map.get((char) number);
                map.put((char) number, (count == null) ? 1 : count+1);
            }
                        System.out.println(map);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
