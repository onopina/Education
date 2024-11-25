package queue_21.queue_2_2;

import java.util.*;

/**
 * Часть 2:
 * Реализовать программу эмулирования очереди в магазине.
 * Люди приходят в конец очереди, уходят из начала очереди.
 * Однако при этом, если пришел пенсионер (от 60 лет и выше),
 * то он обсуживается вне очереди (вне очереди по сравнению с не пенсионерами).
 */
public class Main {
    public static void main(String[] args) {
        Queue<Client> queue = new PriorityQueue<>();

        queue.offer(new Client(30, 1));
        queue.offer(new Client(25, 2));
        queue.offer(new Client(70, 3));
        queue.offer(new Client(35, 4));
        queue.offer(new Client(60, 5));
        queue.offer(new Client(65, 6));
        queue.offer(new Client(45, 7));
        queue.offer(new Client(20, 8));
        queue.offer(new Client(70, 9));
        queue.offer(new Client(75, 10));

        while (!queue.isEmpty())
            System.out.println(queue.poll());
    }
}
