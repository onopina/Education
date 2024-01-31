package multithreading.multithreading_3_6;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Repository {
    private final BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public BlockingQueue<Integer> getQueue() {
        return queue;
    }

    public void produce(){
        while (true) {
            try {
                int number = new Random().nextInt(100);
                queue.put(number);
                System.out.println("The number " + number + " was put to the queue");
                System.out.println(getQueue());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void consume(){
        while (true){
            try {
                int number = queue.take();
                System.out.println("The number " + number + " was taken from the queue");
                System.out.println(getQueue());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
