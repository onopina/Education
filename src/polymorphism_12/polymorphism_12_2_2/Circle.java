package polymorphism_12.polymorphism_12_2_2;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
