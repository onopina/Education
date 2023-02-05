package polymorphism.polymorphism_12_1_1;

public class Triangle extends Figure {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculatePerimeter() {
        return side1+side2+side3;
    }

    @Override
    public double calculateArea() {
        double semiperimeter = (side1+side2+side3)/2;
        return Math.sqrt(semiperimeter * (semiperimeter-side1) * (semiperimeter-side2) * (semiperimeter-side3));
    }
}
