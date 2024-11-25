package map_22_23.hashMap.hashMap_1_3;

public class Patient {
    private int number;

    public Patient(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "number=" + number +
                '}';
    }
}
