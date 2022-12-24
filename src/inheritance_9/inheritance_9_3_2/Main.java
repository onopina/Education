package inheritance_9_3_2;

import controls.SpaceShipControls;
import ships.SpaceShip;

public class Main {

    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
        ship.speedUp();
        ship.speedDown();
        ship.changeAngle(15);
    }
}
