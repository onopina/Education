package abstraction_10_11.abstraction_11_1_2;

public class SpaceShip extends SpaceShipControls {
    public SpaceShip(int speed, int angle) {
        super(speed, angle);
    }

    @Override
    public void speedUp() {
        speed++;
    }

    @Override
    public void speedDown() {
        speed--;
    }

    @Override
    public void changeAngle(int angle) {
        this.angle = angle;
    }
}
