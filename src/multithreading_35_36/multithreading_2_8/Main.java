package multithreading_35_36.multithreading_2_8;

/**
 * 8.	Дан полный алфавит (массив букв). Также дано два потока.
 * Первый – выводит на консоль только четные буквы алфавита, второй – нечетные.
 * Сделать так, чтобы при одновременном запуске потоков алфавит выводился в правильном порядке.
 */
public class Main {
    public static void main(String[] args) {
        Alphabet alphabet = new Alphabet();

        Thread thread1 = new Thread(alphabet::printEvenLetters);
        Thread thread2 = new Thread(alphabet::printOddLetters);

        thread1.start();
        thread2.start();
    }
}

