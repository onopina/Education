package optional_32.optional_4;

import java.util.*;

/**
 * 4.	Сохранить значение вызова метода поиска максимума (3 задание).
 * Проверить, содержится ли там значение. Если содержится, то вывести на консоль.
 * Иначе – бросить исключение. Реализовать тремя способами: isPresent, ifPresentOrElse, orElseThrow.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(5, 10, 25, 15, -5));
        List<Integer> list2 = new ArrayList<>();
        Optional<Integer> result = getMax(list1);

        if (result.isPresent()){
            System.out.println(result.get());
        } else {
            throw new NoSuchElementException("The list is empty");
        }

        result.ifPresentOrElse(System.out::println, () -> {throw new NoSuchElementException("The list is empty");});

        System.out.println(result.orElseThrow());
    }
    public static Optional<Integer> getMax(List<Integer> list){
        if (list.isEmpty())
            return Optional.empty();
        else return Optional.of(Collections.max(list));
    }
}
