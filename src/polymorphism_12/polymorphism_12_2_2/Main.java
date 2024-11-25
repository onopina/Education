package polymorphism_12.polymorphism_12_2_2;

/**
 * Часть 2:
 * Переписать пример с подсчётом периметров фигур (сумма периметров массива фигур) из презентации.
 * Добавить класс Прямоугольник.
 * Изменить подсчет периметра на подсчет площади.
 */
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
