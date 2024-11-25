package multithreading_35_36.multithreading_3_7;

/**
 * 7.	*Реализовать паттерн Producer & Consumer следующим образом: дано длинное сообщение.
 * Сообщение разбивается на массив слов.
 * Задача: производитель должен передать все элементы массива потребителю.
 * Передавать следующий элемент нужно только тогда,
 * когда получено подтверждение о получении очередного элемента от потребителя (wait & notify).
 */
public class Main {
    public static void main(String[] args) {
        Repository repository = new Repository("Hello Java World");

        Thread producingThread = new Thread(repository::produce);
        Thread consumingThread = new Thread(repository::consume);

        consumingThread.start();
        producingThread.start();
    }
}
