package io_nio.io.io_1_10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 10.	Дан список чисел. Развернуть список и записать его в файл.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }

        try(DataOutputStream os = new DataOutputStream(new FileOutputStream("homework.txt"))){
            for (int i = 0; i < list.size(); i++) {
                os.writeInt(list.get(i));
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        try(DataInputStream is = new DataInputStream(new FileInputStream("homework.txt"))){
            for (int i = 0; i < list.size(); i++) {
                System.out.println(is.readInt());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
