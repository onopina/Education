package queue_21.queue_2_1;

/**
 * Часть 1:
 *
 * Реализовать структуру данных Стек на основе очереди.
 * Стек: добавление в начало, извлечение из начала
 * Пример: добавляем «а», «b», «c». Получаем: на вершине стека «с» (последний добавленные элемент).
 * В конце стека «а» (первый добавленный элемент).
 * Далее извлекаем из начала (извлекаем «с»), еще раз извлекаем (извлекаем элемент «b») и так далее:
 * Требуется реализовать только три метода: push, pop, peek.
 */
public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        while (!stack.isEmpty())
            System.out.println(stack.pop());

        System.out.println(stack.peek());
    }
}
