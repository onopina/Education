package io_nio.io.io_2_2;

import java.io.*;
import java.util.Arrays;

/**
 * 2.	Создать массив объектов класса Person. Сериализовать. Далее – десериализовать массив (восстановить массив).
 */
public class Main {
    public static void main(String[] args) throws RuntimeException {
        Person person1 = new Person(100, "Max");
        Person person2 = new Person(101, "Kate");
        Person person3 = new Person(102, "Michael");

        Person[] people = {person1, person2, person3};

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("People.bin"))){
            oos.writeObject(people);
        } catch (IOException e){
            e.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("People.bin"))){
            Person[] peopleRead = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(peopleRead));
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
