package abstraction.abstraction_11_1_2;

public abstract class SpaceShipControls {

    public int speed;
    public int angle;

    public SpaceShipControls(int speed, int angle) {
        this.speed = speed;
        this.angle = angle;
    }

    public abstract void speedUp();
    public abstract void speedDown();
    public abstract void changeAngle(int angle);

}
