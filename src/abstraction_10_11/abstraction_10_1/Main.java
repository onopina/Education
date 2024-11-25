package abstraction_10_11.abstraction_10_1;

/**
 * 1.	Реализовать цепочку наследования: Фигура, Окружность, Квадрат.
 *  Необходимые методы: подсчет периметра, подсчет площади, получение цвета фигуры,
 *  получение диагонали фигуры, получение радиуса фигуры.
 */
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
