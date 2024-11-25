package generics_13.generics_3_6;

/**
 * 6.	Написать метод, принимающий любое количество Фигур (квадрат, круг) из ранее реализованных задач.
 * Метод должен возвращать строку, содержащую информацию по количеству каждой из реализаций класса Фигура
 * (2 квадрата, 3 круга и тд).
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(getNumbers(new Circle(), new Square(), new Triangle(), new Circle()));
    }

    public static String getNumbers(Figure... figures) {
        int numberCircles = 0;
        int numberSquares = 0;
        int numberTriangles = 0;
        for (Figure figure : figures) {
            if (figure instanceof Circle)
                numberCircles++;
            else if (figure instanceof Square)
                numberSquares++;
            else if (figure instanceof Triangle)
                numberTriangles++;
        }
        return "The number of Circles: " + numberCircles + " | The number of Squares: " + numberSquares + " | The number of Triangles: " + numberTriangles;
    }
}
