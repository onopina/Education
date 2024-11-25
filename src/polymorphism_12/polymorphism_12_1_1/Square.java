package polymorphism_12.polymorphism_12_1_1;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
