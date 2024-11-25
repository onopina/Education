package queue_21.queue_2_3;

public class Client {
    private int ID;
    private int ATMNumber;

    public Client(int ID, int ATMNumber) {
        this.ID = ID;
        this.ATMNumber = ATMNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "ID=" + ID +
                ", ATMNumber=" + ATMNumber +
                '}';
    }
}
