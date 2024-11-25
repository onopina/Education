package map_22_23.hashMap.hashMap_1_2;

import java.util.*;

/**
 * Часть 2.
 * Создать Map, в котором хранятся номера паспортов и имена людей (собственные классы не использовать).
 * Необходимо:
 * •	Получить только ключи и вывести их на консоль
 * •	Получить только значения и вывести их на консоль
 * •	Получить все пары ключ-значение
 * •	*Создать List, который хранит в себе пары ключ-значение
 */
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> passports = new HashMap<>();

        passports.put(123456, "Helen");
        passports.put(234567, "Max");
        passports.put(345678, "Alex");
        passports.put(456789, "Alina");
        passports.put(567890, "Max");

        System.out.println(Utils.getKeys(passports));

        System.out.println(Utils.getValues(passports));

        System.out.println(Utils.getKeysValues(passports));

        System.out.println(Utils.generateList(passports));
    }
}
