package inheritance_9.inheritance_9_2_2;

public class Circle extends Figure {
    
    private int radius;
    
    public Circle(String color, int radius){
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }
    
}