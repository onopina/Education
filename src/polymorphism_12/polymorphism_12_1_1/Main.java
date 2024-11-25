package polymorphism_12.polymorphism_12_1_1;

/**
 * 1.	На основании примера с фигурами: дано 8 разных фигур (8 разных объектов).
 * Посчитать их общую площадь; общий периметр.
 */
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        Rectangle rectangle1 = new Rectangle(1, 2);
        Rectangle rectangle2 = new Rectangle(3, 4);
        Square square1 = new Square(1);
        Square square2 = new Square(2);
        Triangle triangle1 = new Triangle(1, 2, 3);
        Triangle triangle2 = new Triangle(4, 5, 6);

        Figure[] figures = {circle1, circle2, rectangle1, rectangle2, square1, square2, triangle1, triangle2};

        System.out.println(Calculator.calculateTotalPerimeter(figures));
        System.out.println(Calculator.calculateTotalArea(figures));
    }
}
