package abstraction.abstraction_10_4;

public abstract class Car {
    public static final int TRACK_LENGTH = 1000;
    public int speed;
    public double fuel_consumption_100km;
    public int chance_breakage;              //every ... km
    public int total_fuel_amount;
    public int num_steps = 0;

    public int total_km;


    public Car(int speed, double fuel_consumption_100km, int chance_breakage, int total_fuel_amount) {
        this.speed = speed;
        this.fuel_consumption_100km = fuel_consumption_100km;
        this.chance_breakage = chance_breakage;
        this.total_fuel_amount = total_fuel_amount;
    }

    public void drive() {
        while (total_km < TRACK_LENGTH){
            System.out.println(getClass().getSimpleName() + " had done " + total_fuel_amount / fuel_consumption_100km * 100 + "km, " + total_fuel_amount + " liters of fuel were used");
            System.out.println("Total of " + getClass().getSimpleName() + " is " + (total_km += total_fuel_amount / fuel_consumption_100km * 100) + " km");
            System.out.println(getClass().getSimpleName() + " is needed to filled up!");
            num_steps++;
        }
        int count_breakage = total_km/chance_breakage;
        num_steps+=count_breakage;

        System.out.println("RESULT:");
        System.out.println("The number of steps of " + getClass().getSimpleName() + " is " + num_steps);
        System.out.println("Total of " + getClass().getSimpleName() + " is " + total_km + " km");
    }



}
