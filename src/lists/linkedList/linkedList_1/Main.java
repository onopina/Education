package lists.linkedList.linkedList_1;

import java.util.LinkedList;

/**
 * Часть 1.
 * 1.	Изучить методы LinkedList.
 * E роll() - возвращает элемент из головы очереди и удаляет его. Возвращает null, если очередь пуста.
 * E peek() - возвращает элемент из головы очереди. Возвращает null, если очередь пуста. Элемент не удаляется
 * boolean offer(Е оbj) - пытается добавить оbj в очередь. Возвращает true, если оbj добавлен, и false в противном случае
 * void push(Е obj) - добавляет элемент в голову двунаправленной очереди.
 * Если в очереди фиксированного объема нет места, возбуждает исключение IllegalStateException.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.offer(5);
        list.offer(10);
        list.offer(15);
        System.out.println(list);

        list.push(0);
        System.out.println(list);

        list.poll();
        System.out.println(list);

        System.out.println(list.peek());

        System.out.println(list);
    }
}
