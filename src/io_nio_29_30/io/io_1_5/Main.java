package io_nio_29_30.io.io_1_5;

import java.io.*;
import java.util.Random;

/**
 * 5.	Записать и считать из файла все виды примитивов с помощью специального класса.
 */
public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        try (DataOutputStream os = new DataOutputStream(new FileOutputStream("homework.txt"))){
                os.writeInt(r.nextInt(10));
                os.writeByte(r.nextInt(10));
                os.writeBoolean(true);
                os.writeUTF("Some text");
                os.writeDouble(r.nextDouble(10));
        } catch (IOException e){
            e.printStackTrace();
        }

        try (DataInputStream is = new DataInputStream(new FileInputStream("homework.txt"))){
            int i = is.readInt();
            System.out.println(i + " ");

            byte b = is.readByte();
            System.out.println(b + " ");

            boolean bo = is.readBoolean();
            System.out.println(bo + " ");

            String s = is.readUTF();
            System.out.println(s + " ");

            double d = is.readDouble();
            System.out.println(d + " ");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
