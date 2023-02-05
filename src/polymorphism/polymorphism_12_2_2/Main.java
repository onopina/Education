package polymorphism.polymorphism_12_2_2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Square square = new Square(5);
        Triangle triangle = new Triangle(2,5,6);
        Rectangle rectangle = new Rectangle(4,8);

        Figure[] figures = {circle, square, triangle, rectangle};

        System.out.println(Calculator.calculateTotalArea(figures));

    }
}
