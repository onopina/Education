package presentation.multithreading;

public class MainTest {
    public static void main(String[] args) {
        Test test = new Test();

        Thread thread1 = new Thread(test::printEvenNumber);
        Thread thread2 = new Thread(test::printOddNumber);

        thread1.start();
        thread2.start();

    }

}
