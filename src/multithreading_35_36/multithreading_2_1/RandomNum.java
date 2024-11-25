package multithreading_35_36.multithreading_2_1;

import java.util.Random;

public class RandomNum {
    private volatile int randomNum;

    public RandomNum() {
        this.randomNum = 0;
    }

    public int getRandomNum() {
        return randomNum;
    }

    public synchronized void doCycle(){
            try {
                while (randomNum != 10) {
                    System.out.println("The random number is " + randomNum);
                    wait();
                }
                System.out.println("The random number is " + randomNum);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

    }

    public void generateRandomNum(){
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            synchronized (this){
                randomNum = random.nextInt(0, 11);
                notify();
                if (randomNum == 10)
                    break;
            }
        }
    }
}
