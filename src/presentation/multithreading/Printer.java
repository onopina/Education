package presentation.multithreading;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Printer {
    private final Queue<String> queue = new ArrayDeque<>();
//    private volatile String letter;


    public Queue<String> getQueue() {
        return queue;
    }

    public synchronized void produce(){
        while (true) {
            if (!queue.isEmpty()){
                try {
                    wait();
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Please type a letter: ");
                    String letter = scanner.nextLine();
                    queue.add(letter);
                    System.out.println(getQueue());

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Please type a letter: ");
                String letter = scanner.nextLine();
                queue.add(letter);
                System.out.println(getQueue());
                notifyAll();
            }
        }
    }

    public synchronized void consumeA(){
        while (true){
            if (queue.isEmpty()){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            String letter = queue.poll();
            if (letter.equals("A")){
                System.out.println(letter);
            }
            notifyAll();
        }
    }

    public synchronized void consumeB(){
        while (true){
            if (queue.isEmpty()){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            String letter = queue.poll();
            if (letter.equals("B")){
                System.out.println(letter);
            }
            notifyAll();
        }
    }

//    public void finish(){
//        while (true){
//            try {
//                String letterTaken = queue.take();
//                if (letterTaken.equals("Finish")){
//                    System.out.println(queue);
//                }
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }

    public synchronized void printA(String letter) {
        while (true) {
            if (!letter.equals("A")) {
                notifyAll();
            } else {
                System.out.print("A");
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public synchronized void printB(String letter) {
        while (true) {
            if (!letter.equals("B")) {
                notifyAll();
            } else {
                System.out.print("B");
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public synchronized void printC(String letter) {
        while (true) {
            if (!letter.equals("C")) {
                notifyAll();
            } else {
                System.out.print("C");
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


}
