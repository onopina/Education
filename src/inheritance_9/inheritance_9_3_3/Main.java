package inheritance_9_3_3;

public class Main
{
	public static void main(String[] args) {
	    
    Vehicle vehicle = new Vehicle(0);
	Car car1 = new Car(100);
	Train train1 = new Train(50);
	Motorcycle motorcycle1 = new Motorcycle(120);
	Motorcycle motorcycle2 = new Motorcycle(150);
	
	car1.drive();
	train1.drive();
	motorcycle1.drive();
	motorcycle2.drive();

    System.out.println("Total Vehicles: " + vehicle.countVehicles);

	}
}
