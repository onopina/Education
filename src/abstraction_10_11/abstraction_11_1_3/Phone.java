package abstraction_10_11.abstraction_11_1_3;

public class Phone implements Workable {
    @Override
    public void on() {
        System.out.println("The phone is ON");
    }

    @Override
    public void off() {
        System.out.println("The phone is OFF");
    }
}
