package inheritance_9.inheritance_9_3_3;

public class Vehicle {
    
    private static int fuel_consumption_100km = 10;
    public double km_numbers;
    public static int countVehicles=-1;
    
    public Vehicle (double km_numbers){
        if (km_numbers>0){
            this.km_numbers = km_numbers;
        }
        else {
            this.km_numbers = 0;
        }
        countVehicles++;
    }
    
    public void drive(){
        System.out.println(km_numbers/fuel_consumption_100km);
    }
    
}