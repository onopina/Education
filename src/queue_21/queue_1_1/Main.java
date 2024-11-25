package queue_21.queue_1_1;

/**
 * Часть 1:
 * Реализовать обобщенный класс Очередь (односторонняя).
 * Реализовать все методы (offer, poll, remove, element, peek) в соответствии с их требованием (бросают исключение или нет).
 */
public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println(queue.remove());
        System.out.println(queue.element());

        while (!queue.isEmpty())
            System.out.print(queue.poll() + " ");

        System.out.println();
        System.out.println(queue.peek());
    }
}
