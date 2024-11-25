package io_nio_29_30.io.io_2_1;

import java.io.*;

/**
 * 1.	Написать класс Person. Создать 3 объекта. Сериализовать их. Далее – десериализовать их (восстановить три объекта).
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(100, "Max");
        Person person2 = new Person(101, "Kate");
        Person person3 = new Person(102, "Michael");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("People.bin"))){
            oos.writeObject(person1);
            oos.writeObject(person2);
            oos.writeObject(person3);
        } catch (IOException e){
            e.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("People.bin"))){
            Person person1read = (Person) ois.readObject();
            Person person2read = (Person) ois.readObject();
            Person person3read = (Person) ois.readObject();
            System.out.println(person1);
            System.out.println(person2);
            System.out.println(person3);
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
