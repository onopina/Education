package multithreading_35_36.multithreading_2_1;

/**
 1.	Дан цикл while, который использует поле RandomNum и выполняется в отдельном потоке до тех пор,
 пока не будет сгенерировано число 10 (на каждой итерации необходимо генерировать случайное число от 0 до 10).
 RandomNum изменяется в другом потоке.
 Написать корректную программу, при которой гарантируется остановка метода while.
 */
public class Main {
    public static void main(String[] args) {
        RandomNum randomNum = new RandomNum();

        Thread thread1 = new Thread1(randomNum);
        Thread thread2 = new Thread2(randomNum);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("The random number is " + randomNum.getRandomNum());
    }

    private static class Thread1 extends Thread{
        private RandomNum randomNum;

        public Thread1(RandomNum randomNum) {
            this.randomNum = randomNum;
        }

        @Override
        public void run() {
            randomNum.doCycle();
        }
    }

    private static class Thread2 extends Thread{
        private RandomNum randomNum;

        public Thread2(RandomNum randomNum) {
            this.randomNum = randomNum;
        }

        @Override
        public void run() {
            randomNum.generateRandomNum();
        }
    }
}
