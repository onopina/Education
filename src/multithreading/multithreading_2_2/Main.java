package multithreading.multithreading_2_2;

/**
 * 2.	Дан цикл while, который использует поле Counter и выполняется в отдельном потоке до тех пор, пока count < 1000.
 * Counter инкрементируется. Написать корректную программу, при которой гарантируется остановка метода while.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter(0);

        Thread thread1 = new MyThread1(counter);
        Thread thread2 = new MyThread2(counter);

        thread1.start();
        thread2.start();
    }

    private static class MyThread1 extends Thread{
        private Counter counter;

        private MyThread1(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            counter.doCycle();
        }
    }

    private static class MyThread2 extends Thread{
        private Counter counter;

        private MyThread2(Counter counter){
            this.counter = counter;
        }

        @Override
        public void run() {
//            for (int i = 0; i < 100; i++) {
                counter.incrementCounter();
//            }

        }
    }



}
