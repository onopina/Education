package queue_21.queue_1_4;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Часть 4:
 * Создать класс Person. Добавить поля: имя, фамилия.
 * Использовать класс Person в качестве хранения для очереди PriorityQueue.
 * Сначала извлекаются элементы, у которых в сумме количество символов в имени и фамилии меньше
 * (размер строк имени и фамилии вместе).
 */
public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.sumSymbols(), o2.sumSymbols());
            }
        });

        queue.offer(new Person("Bob", "Fischer"));
        queue.offer(new Person("Max", "Weber"));
        queue.offer(new Person("Kate", "Jones"));
        queue.offer(new Person("Kate", "Wilson"));
        queue.offer(new Person("Bob", "Brown"));

        while (!queue.isEmpty())
            System.out.println(queue.poll());
    }
}
