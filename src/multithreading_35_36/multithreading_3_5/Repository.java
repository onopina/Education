package multithreading_35_36.multithreading_3_5;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class Repository {
    private final Queue<Integer> queue = new ArrayDeque<>();
    private final int MAX_SIZE = 10;

    public Queue<Integer> getQueue() {
        return queue;
    }

    public synchronized void produce(){
            while (queue.size() == MAX_SIZE) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
                Random random = new Random();
                int number = random.nextInt(10);
                queue.add(number);
                System.out.println("The number " + number + " was added to the queue");
                System.out.println(getQueue());
                notify();
    }

    public synchronized void consume() {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int number = queue.poll();
        System.out.println("The number " + number + " was taken from the queue");
        System.out.println(getQueue());
        notify();
    }
}
