package multithreading.multithreading_1_2;

import java.util.Random;

/**
 * 2.	Дан большой массив (10 миллионов элементов). Посчитать его сумму:
 * •	Обычным способом в новом потоке (не в main-thread);
 * •	Разбить на несколько потоков (3-4);
 * Сравнить время работы.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = initArray(10_000_000);

        Thread t = new Thread(() -> System.out.println("The sum is " + getSumOfFullArray(array)));

        System.out.println("The time of get sum by 1 thread is " + measureTime(t));


        long start = System.nanoTime();

        int[] sumOfQuarter = new int[4];
        Thread thread1 = new Thread(() -> sumOfQuarter[0] = getSumOfFirstQuarterOfArray(array));
        Thread thread2 = new Thread(() -> sumOfQuarter[1] = getSumOfSecondQuarterOfArray(array));
        Thread thread3 = new Thread(() -> sumOfQuarter[2] = getSumOfThirdQuarterOfArray(array));
        Thread thread4 = new Thread(() -> sumOfQuarter[3] = getSumOfFourthQuarterOfArray(array));
        Thread[] threads = {thread1, thread2, thread3, thread4};

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }

        int sum = 0;
        int count = 0;

        for (int i = 0; i < threads.length; i++) {
            while (count < 4){
                if (threads[i].getState() == Thread.State.TERMINATED) {
                    sum += sumOfQuarter[i];
                    i++;
                    count++;
                }
            }
        }

        long finish = System.nanoTime() - start;

        System.out.println("The sum is " + sum + "\nThe time of get sum by 4 threads is " + finish);
    }

    public static int[] initArray(int capacity){
        Random random = new Random();
        int[] result = new int[capacity];

        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(100);
        }
        return result;
    }

    public static int getSumOfFullArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int getSumOfFirstQuarterOfArray(int[] array){
        int sum = 0;

        for (int i = 0; i < array.length/4; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int getSumOfSecondQuarterOfArray(int[] array){
        int sum = 0;

        for (int i = array.length/4; i < array.length/2; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int getSumOfThirdQuarterOfArray(int[] array){
        int sum = 0;

        for (int i = array.length/2; i < array.length/4*3; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int getSumOfFourthQuarterOfArray(int[] array){
        int sum = 0;

        for (int i = array.length/4*3; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static long measureTime(Thread thread){
        long start = System.nanoTime();
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return System.nanoTime() - start;
    }
}
