package inheritance_9.inheritance_9_3_2.ships;

import inheritance_9.inheritance_9_3_2.controls.SpaceShipControls;

public class SpaceShip extends SpaceShipControls {
    public void speedUp(){
        super.speedUp();
    }
    public void speedDown(){
        super.speedDown();
    }
    public void changeAngle(int angle){
        super.changeAngle(angle);
    }
}
