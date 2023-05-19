package queue.queue_1_3;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Часть 3:
 * Создать класс Person. Добавить поля: имя, фамилия.
 * Использовать класс Person в качестве хранения для очереди PriorityQueue.
 * Сначала извлекаются элементы, у которых имя раньше по алфавитному порядку.
 * Если имена совпадают, то необходимо решать, какой элемент извлекается первым, на основании фамилии
 * (сначала проверяем имя, если имена равны – проверяем по фамилии).
 */
public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getFirstName().equals(o2.getFirstName()))
                    return o1.getSecondName().compareTo(o2.getSecondName());
                return o1.getFirstName().compareTo(o2.getFirstName());
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
