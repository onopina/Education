package map.hashMap.hashMap_1_3;

import java.util.Objects;

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
