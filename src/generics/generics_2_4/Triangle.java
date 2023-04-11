package generics.generics_2_4;

public class Triangle extends Figure{
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double semiperimeter = (side1+side2+side3)/2;
        return Math.sqrt(semiperimeter * (semiperimeter-side1) * (semiperimeter-side2) * (semiperimeter-side3));
    }
}
