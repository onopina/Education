package abstraction.abstraction_10_1;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }
    @Override
    public double getDiagonal() {
        return radius*2;
    }

    @Override
    public String getColor() {
        return color;
    }

    public double getRadius(){
        return radius;
    }
}
