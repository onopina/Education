package multithreading_35_36.multithreading_3_8;

/**
 * 8.	*Дано три потока.
 * Каждый поток печатает свою букву, например, первый поток – А, второй – B, третий – C.
 * Написать программу, в которой выводится следующее сообщение: ABC_ABC_ABC.
 */
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread threadA = new Thread(printer::printA);
        Thread threadB = new Thread(printer::printB);
        Thread threadC = new Thread(printer::printC);

        threadA.start();
        threadB.start();
        threadC.start();
    }
}
