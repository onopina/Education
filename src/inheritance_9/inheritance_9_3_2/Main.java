package inheritance_9.inheritance_9_3_2;

import inheritance_9.inheritance_9_3_2.controls.SpaceShipControls;
import inheritance_9.inheritance_9_3_2.ships.SpaceShip;

public class Main {

    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
        ship.speedUp();
        ship.speedDown();
        ship.changeAngle(15);
    }
}
