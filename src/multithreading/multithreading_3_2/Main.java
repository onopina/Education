package multithreading.multithreading_3_2;

import java.util.Random;

/**
 * 2.	Дан метод, который работает с файлом.
 * В метод передается строка: read или write, означающая, какую операцию необходимо выполнить с файлом.
 * Если write, то записываются любые 5 строк.
 * Если read, просто выводится на экран содержимое файла.
 * Одновременно с методом работают три потока.
 * Обеспечить корректную работу программы.
 */
public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();

        for (int i = 0; i < 3; i++) {
            new Thread(() -> worker.work(getRandom())).start();
        }
    }

    private static String getRandom(){
        boolean random = new Random().nextBoolean();
        if (random){
            return "read";
        }
        else return "write";
    }
}
