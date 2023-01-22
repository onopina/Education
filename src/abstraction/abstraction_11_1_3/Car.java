package abstraction.abstraction_11_1_3;

public class Car implements Workable{

    @Override
    public void on() {
        System.out.println("The car is ON");
    }

    @Override
    public void off() {
        System.out.println("The car is OFF");
    }
}
