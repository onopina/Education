package multithreading.multithreading_3_8;

import java.util.ArrayList;
import java.util.List;

public class Printer {
    List<Character> list;
    private boolean printA;
    private boolean printB;
    private boolean printC;

    public Printer() {
        this.list = new ArrayList<>();
        printA = true;
        printB = false;
        printC = false;
    }

    public List<Character> getResult() {
        return list;
    }

    public synchronized void printA(){
        for (int i = 0; i < 15; i++) {
            if (!printA){
                try {
                    wait(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.print('A');
                printA = false;
                printB = true;
                printC = false;
                notifyAll();
            }
        }
    }

    public synchronized void printB(){
        for (int i = 0; i < 15; i++) {
            if (!printB){
                try {
                    wait(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.print('B');
                printA = false;
                printB = false;
                printC = true;
                notifyAll();
            }
        }
    }

    public synchronized void printC(){
        for (int i = 0; i < 15; i++) {
            if (!printC){
                try {
                    wait(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.print('C');
                System.out.print('_');
                printA = true;
                printB = false;
                printC = false;
                notifyAll();
            }
        }
    }
}
