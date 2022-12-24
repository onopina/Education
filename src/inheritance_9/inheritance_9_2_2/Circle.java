package inheritance_9_2_2;

public class Circle extends Figure {
    
    private int radius;
    
    public Circle(String color, int radius){
        super(color);
        this.radius = radius;
    }
    
    public double area() {
        return Math.PI*radius*radius;
    }
    
}