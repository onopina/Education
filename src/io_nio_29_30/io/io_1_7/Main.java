package io_nio_29_30.io.io_1_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * 7.	Вручную создать файл Students со следующей структурой:
 * «имя, фамилия, учебная группа, средний балл».
 * Считать файл Students, создать массив студентов:
 */
public class Main {
    public static void main(String[] args) {
        String[] students = new String[5];

        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Алина\\IdeaProjects\\Education\\src\\io_nio\\io\\io_1_7\\Students.txt"))){
            for (int i = 0; i < students.length; i++) {
                students[i] = br.readLine();
            }
            System.out.println(Arrays.toString(students));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
