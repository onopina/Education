package polymorphism.polymorphism_12_1_1;

public class Rectangle extends Figure {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculatePerimeter() {
        return side1*2 + side2*2;
    }

    @Override
    public double calculateArea() {
        return side1*side2;
    }
}
