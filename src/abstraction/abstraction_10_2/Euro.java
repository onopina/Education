package abstraction.abstraction_10_2;

public class Euro extends Currency {
    
    public Euro (double rate){
        super(rate);
    }

    @Override
    public double exchangeToRub(double count) {
        return rate*count;
    }
}