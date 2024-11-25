package abstraction_10_11.abstraction_10_2;

public class Dollar extends Currency {
    
    public Dollar (double rate) {
        super(rate);
    }

    @Override
    public double exchangeToRub(double count) {
        return rate*count;
    }
}