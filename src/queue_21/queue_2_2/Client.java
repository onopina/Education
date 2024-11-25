package queue_21.queue_2_2;


public class Client implements Comparable<Client>{
    private int age;
    private int ID;
    private boolean retireeStatus;

    public Client(int age, int ID) {
        this.age = age;
        this.ID = ID;
        if (age >= 60)
            this.retireeStatus = true;
        else
            this.retireeStatus = false;
    }

    @Override
    public String toString() {
        return "Client{" +
                "age=" + age +
                ", ID=" + ID +
                '}';
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Client o) {
        if (this.retireeStatus && !o.retireeStatus)
            return -1;
        if (!this.retireeStatus && o.retireeStatus)
            return 1;
        return Integer.compare(this.ID, o.ID);
    }
}
