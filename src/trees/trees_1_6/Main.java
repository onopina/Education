package trees.trees_1_6;

import java.util.*;

/**
 * 6.	Написать программу, сравнивающую скорость поиска в TreeSet и HashSet (10 миллионов записей).
 * При сравнении учитывать только скорость поиска, добавление не учитывать.
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < 10000000; i++) {
            hashSet.add(i);
            treeSet.add(i);
        }

        long startHS = System.nanoTime();
        hashSet.contains(99000);
        long finishHS = System.nanoTime() - startHS;

        long startTS = System.nanoTime();
        treeSet.contains(99000);
        long finishTS = System.nanoTime() - startTS;

        System.out.println("The lookup time in HashSet is " + finishHS);
        System.out.println("The lookup time in TreeSet is " + finishTS);
    }
}
