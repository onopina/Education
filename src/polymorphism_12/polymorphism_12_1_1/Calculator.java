package polymorphism_12.polymorphism_12_1_1;

public class Calculator {
    public static double calculateTotalPerimeter(Figure[] figures){
        double perimeter = 0;
        for(Figure figure : figures){
            perimeter += figure.calculatePerimeter();
        }
        return perimeter;
    }

    public static double calculateTotalArea(Figure[] figures){
        double area = 0;
        for(Figure figure : figures){
            area += figure.calculateArea();
        }
        return area;
    }
}
