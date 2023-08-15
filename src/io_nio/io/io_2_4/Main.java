package io_nio.io.io_2_4;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 4.	Решить задачу 3 так, чтобы при сериализации список оценок игнорировался (не сериализовался).
 */
public class Main {
    public static void main(String[] args) {
        String[] subjects = {"English", "Math", "Music"};
        Random random = new Random();

        Map<String, Integer> scores1 = new HashMap<>();
        Map<String, Integer> scores2 = new HashMap<>();
        Map<String, Integer> scores3 = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            scores1.put(subjects[i], random.nextInt(2, 6));
            scores2.put(subjects[i], random.nextInt(2, 6));
            scores3.put(subjects[i], random.nextInt(2, 6));
        }

        Student student1 = new Student("Ivan", "Potapov", scores1);
        Student student2 = new Student("Anna", "Volkova", scores2);
        Student student3 = new Student("Max", "Burtov", scores3);

        Student[] students = {student1, student2, student3};

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Students.bin"))){
            oos.writeObject(students);
        } catch (IOException e){
            e.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Students.bin"))){
            Student[] studentsRead = (Student[]) ois.readObject();
            System.out.println(Arrays.toString(studentsRead));
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
