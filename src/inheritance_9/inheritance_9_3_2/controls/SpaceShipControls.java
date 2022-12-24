package inheritance_9.inheritance_9_3_2.controls;

public class SpaceShipControls {

    private int speed;
    private int angle;

    protected SpaceShipControls(){

    }
    protected void speedUp(){
        speed++;
    }
    protected void speedDown(){
        speed--;
    }
    protected void changeAngle(int angle){
        this.angle = angle;
    }
}
