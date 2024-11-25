package generics_13.generics_2_4;

import java.util.ArrayList;
import java.util.List;

/**
 * 4.	Создать иерархию с абстрактным классом: Круг, Квадрат, Треугольник.
 * Реализовать метод, который будет принимать список Фигур и возвращать их суммарную площадь
 * (метод вычисления площади реализовать).
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(15);
        Triangle triangle = new Triangle(3, 4, 5);
        List<Figure> figures = new ArrayList<>();
        figures.add(circle);
        figures.add(square);
        figures.add(triangle);
        System.out.println(getSumArea(figures));
    }

    public static double getSumArea(List<Figure> figures){
        double sum = 0;
        for(Figure figure : figures){
            sum += figure.getArea();
        }
        return sum;
    }
}
