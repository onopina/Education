package queue.queue_2_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ATMQueue extends LinkedList<Client> {

    Queue<Client> ATM1 = new LinkedList<>();
    Queue<Client> ATM2 = new LinkedList<>();

    public void emulate(){
        initQueue();
        chooseATM();
        finishQueue();
    }
    private void initQueue() {
        for (int i = 0; i < 6; i++) {
            ATM1.offer(new Client(i + 1, 1));
            System.out.println("Client{" +
                "ID=" + (i+1) + ", ATMNumber=" + 1 +
                        "} got in line");
        }
        for (int i = 6; i < 9; i++) {
            ATM2.offer(new Client(i + 1, 2));
            System.out.println("Client{" +
                    "ID=" + (i+1) + ", ATMNumber=" + 2 +
                    "} got in line");
        }
    }                          //Создать 2 исходных очереди: 6 чел. в ATM #1, 3 чел. в ATM #2

    private boolean randomChoice() {
        Random random = new Random();
        return random.nextBoolean();
    }

    private Client leaveQueue() {
        if (randomChoice())
            return ATM1.poll();
        else
            return ATM2.poll();
    }                          //Сэмулировать случайный выход из очереди (50/50)

    private void chooseATM() {
        for (int i = 9; i < 100; i++) {

            System.out.println(leaveQueue() + "got off the line");

            if (ATM1.size() < ATM2.size()) {
                ATM1.offer(new Client(i + 1, 1));

                System.out.println("Client{" +
                        "ID=" + (i+1) + ", ATMNumber=" + 1 +
                        "} got in line");
            } else {
                ATM2.offer(new Client(i + 1, 2));

                System.out.println("Client{" +
                        "ID=" + (i+1) + ", ATMNumber=" + 2 +
                        "} got in line");
            }
        }
    }                          //Сэмулировать выбор более короткой очереди
    private void finishQueue(){
        while (!ATM1.isEmpty() && !ATM2.isEmpty())
            System.out.println(leaveQueue() + "got off the line");
    }                          //Выход из очереди последних клиентов (до завершения работы)
}
