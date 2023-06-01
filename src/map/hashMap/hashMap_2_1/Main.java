package map.hashMap.hashMap_2_1;

/**
 * Часть 1.
 * Реализовать простую обобщенную хеш-таблицу (HashMap). Логика упрощенная. Необходимые методы:
 * •	Расширения нет. Начальный размер – 50 элементов.
 * •	При коллизии складывать в конец связного списка. Взять стандартный LinkedList.
 * •	Методы проверки на равенство: hashCode, equals, определение индекса (побитовое умножение).
 * •	Методы для работы: добавление, удаление по ключу, получение по ключу, проверки по ключу (contains).
 * •	Дополнительные методы: вывод хеш-таблицы в формате ключ-значение.
 *
 * Часть 2*.
 * Добавить в реализацию хеш-таблицу автоматическое расширение массива при необходимости с операцией перехеширования –
 * повторного добавления элементов в новую хеш-таблицу больше размера.
 * Расширение происходит при size / capacity >= 0.75 (load factor).
 */
public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, Integer> map = new MyHashMap<>();
        map.put(10, 15);
        map.put(10, 20);
        map.put(15, 25);
        map.put(20, 35);
        map.put(40, 45);
        map.put(50, 55);
        map.put(60, 65);

        System.out.println(map.remove(40));

        System.out.println(map.get(50));

        System.out.println(map.containsKey(20));

        map.print();

        System.out.println("The size of HashMap is " + map.getRealSize());
    }



}
