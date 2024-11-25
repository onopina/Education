package inheritance_9.inheritance_9_2_3;

public class Currency {
    
    public double rate;
    
    public Currency (double rate){
        if (rate>0){
            this.rate = rate;
        }
        else {
            this.rate = 0;
        }
    }
    
    public double exchangeToRub(double count){
        return count*rate;
    }
    
}