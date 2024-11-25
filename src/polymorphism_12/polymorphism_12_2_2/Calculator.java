package polymorphism_12.polymorphism_12_2_2;

public class Calculator {

    public static double calculateTotalArea(Figure[] figures){
        double area = 0;
        for(Figure figure : figures){
            area += figure.calculateArea();
        }
        return area;
    }


}
