package polymorphism_12.polymorphism_12_1_1;

public class Rhombus extends Figure {
    private double side;

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
