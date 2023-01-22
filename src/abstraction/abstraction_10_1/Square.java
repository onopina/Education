package abstraction.abstraction_10_1;

public class Square extends Figure{
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return side*4;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public double getDiagonal() {
        return side*Math.sqrt(2);
    }

    @Override
    public String getColor() {
        return color;
    }

}
