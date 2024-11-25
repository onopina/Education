package presentation.multithreading.Arkhipov1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyBlockingQueue queue = new MyBlockingQueue();

        Thread worker = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    Runnable task = queue.get();
                    task.run();
                }
            }
        });
        worker.start();

        for (int i = 0; i < 10; i++) {
            queue.put(getTask());

        }

    }

    public static Runnable getTask(){
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("Task started: " + this);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task finished: " + this);
            }
        };
    }

    public static class MyBlockingQueue{
        private final ArrayList<Runnable> tasks = new ArrayList<>();

        public synchronized Runnable get(){
            while (tasks.isEmpty()){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            Runnable task = tasks.get(0);
            tasks.remove(task);
            return task;
        }

        public synchronized void put(Runnable task){
            tasks.add(task);
            notify();
        }
    }
}
