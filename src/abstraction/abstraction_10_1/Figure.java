package abstraction.abstraction_10_1;

public abstract class Figure {
    public String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double calculatePerimeter();
    public abstract double calculateArea();
    public abstract double getDiagonal();
    public abstract String getColor();

}
