package polymorphism_12.polymorphism_12_2_1;

public class Euro extends Currency{

    public double rate = 76.90;

    @Override
    public double exchangeToRub() {
        return rate*100;
    }
}
