package abstraction.abstraction_11_1_1;

public class Human implements Walkable, Jumpable {

    public double speed;

    public Human(){
        speed = 5.5;
    }
    public Human(double speed) {
        this.speed = speed;
    }

    @Override
    public void walk() {
        System.out.println("I'm walking at a speed of " + speed + " km/h");
    }
    @Override
    public void jump() {
        System.out.println("I'm jumping");
    }


}
