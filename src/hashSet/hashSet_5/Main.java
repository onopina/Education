package hashSet.hashSet_5;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * 5.	Дан отсортированный список с дубликатами элементов.
 * Удалить дубликаты из списка, сохранив отсортированный порядок.
 */
public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Olga");
        list.add("Vlad");
        list.add("Igor");
        list.add("Sveta");
        list.add("Max");
        list.add("Vlad");
        list.add("Petr");
        list.add("Misha");
        list.add("Petr");

        System.out.println(removeDuplicates(list));
    }

    public static <T> LinkedHashSet<T> removeDuplicates(List<T> list){
        return new LinkedHashSet<>(list);
    }
}
