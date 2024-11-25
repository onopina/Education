package inheritance_9.inheritance_9_3_3;

/**
 * 3.	Даны классы: Машина, Поезд, Мотоцикл.
 * •	Определить для них базовый класс.
 * •	У каждого класса свой расход топлива на 100 км (в условных единицах).
 *  Больше всего у поезда, далее – у машины, далее – у мотоцикла.
 * •	Добавить метод: ехать. Метод принимает количество километров, которое нужно проехать.
 *  Учитывая разные классы, переопределить данный метод, чтобы он сообщал:
 *  «машина проехала x километров, потрачено y топлива» (машина, поезд, мотоцикл).
 * •	Посчитать, сколько объектов любого типа (машина, поезд, мотоцикл) было задействовано.
 */
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
