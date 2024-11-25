package inheritance_9.inheritance_9_2_2;

public class Square extends Figure {
    
    private int side;
    
    public Square(String color, int side){
        super(color);
        this.side = side;
    }
    
    public double getArea() {
        return side*side;
    }
    
}