package inheritance_9_2_2;

public class Square extends Figure {
    
    private int side;
    
    public Square(String color, int side){
        super(color);
        this.side = side;
    }
    
    public double area() {
        return side*side;
    }
    
}