package trees.trees_1_5;

import java.util.Arrays;
import java.util.Random;
import java.util.TreeSet;

/**
 * 5.	Дано 10 чисел от 0 до 100 включительно. Для генерации использовать класс Random.
 * Добавить числа в дерево. Найти ближайшее число к 50 (ближайшее большее и ближайшее меньшее).
 * Если в дереве содержится число 50, то его учитывать не нужно
 * (первый ответ строго большее 50, второй ответ строго меньшее 50).
 */
public class Main {
    public static void main(String[] args) {
        int[]arr = new int[10];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }

        System.out.println(Arrays.toString(arr));

        TreeSet<Integer> set = new TreeSet<>();

        for (Integer number : arr){
            set.add(number);
        }

        System.out.println("The nearest higher number to 50 is " + set.higher(50));
        System.out.println("The nearest lower number to 50 is " + set.lower(50));
    }
}
