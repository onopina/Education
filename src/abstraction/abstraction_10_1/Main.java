package abstraction.abstraction_10_1;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("Blue", 10);
        Square square = new Square("Red",5);
        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.calculateArea());
        System.out.println(circle.getColor());
        System.out.println(circle.getDiagonal());
        System.out.println(circle.getRadius());
        System.out.println();
        System.out.println(square.calculatePerimeter());
        System.out.println(square.calculateArea());
        System.out.println(square.getColor());
        System.out.println(square.getDiagonal());

    }
}
