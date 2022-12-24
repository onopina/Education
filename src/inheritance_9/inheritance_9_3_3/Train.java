package inheritance_9_3_3;

public class Train extends Vehicle {
    
    private static int fuel_consumption_100km = 50;
    
    public Train(double km_numbers){
        super(km_numbers);
    }
    
    public void drive(){
        System.out.println("The Train had done " + km_numbers + "km, " + km_numbers/fuel_consumption_100km + " liters of fuel were used");
    }
    
}