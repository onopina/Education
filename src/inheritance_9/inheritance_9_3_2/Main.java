package inheritance_9.inheritance_9_3_2;

import inheritance_9.inheritance_9_3_2.ships.SpaceShip;

/**
 * 2.	Реализовать пример с Космическим кораблем из презентации.
 *  Должно быть три класса в трех разных пакетах: SpaceShipControls, SpaceShip, Main.
 */
public class Main {

    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
        ship.speedUp();
        ship.speedDown();
        ship.changeAngle(15);
    }
}
