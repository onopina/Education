package polymorphism.polymorphism_12_2_2;

public class Square extends Figure{

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }
}
