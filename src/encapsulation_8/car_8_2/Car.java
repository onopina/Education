package encapsulation_8.car_8_2;

public class Car {

    private String brand;
    private String color;
    private int max_speed;

    public Car (String brand, String color, int max_speed){
        this.brand = brand;
        this.color = color;

        if (max_speed>0){
            this.max_speed = max_speed;
        }
        else {
            this.max_speed = 0;
        }
    }

    public String getBrand() {
        return brand;
    }
    public String getColor() {
        return color;
    }
    public int getMax_speed() {
        return max_speed;
    }

    public void switchOnCar(){
        System.out.println("The car is turned on");
    }
    private void turnOnEngine(){
        System.out.println("The engine is turned on");
    }
    public void hitGas(){
        System.out.println("The gas pedal is pressed down");
    }
    public void hitBrake(){
        System.out.println("The brake pedal is pressed down");
    }
    public void switchOffCar(){
        System.out.println("The car is turned off");
    }
    private void turnOffEngine(){
        System.out.println("The engine is turned off");
    }
    public void drive(){
        switchOnCar();
        hitGas();
        hitBrake();
        switchOffCar();
        System.out.println("You're arriving to your destination");
    }

}
