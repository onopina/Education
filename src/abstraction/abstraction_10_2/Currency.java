package abstraction.abstraction_10_2;

public abstract class Currency {
    
    public double rate;
    
    public Currency(double rate){
        if (rate>0){
            this.rate = rate;
        }
        else {
            this.rate = 0;
        }
    }

    public abstract double exchangeToRub(double count);
}