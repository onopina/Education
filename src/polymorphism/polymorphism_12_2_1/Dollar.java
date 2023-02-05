package polymorphism.polymorphism_12_2_1;

public class Dollar extends Currency{

     public double rate = 70.60;

     @Override
     public double exchangeToRub() {
          return rate*100;
     }
}
