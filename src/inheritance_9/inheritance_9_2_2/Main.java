package inheritance_9_2_2;

public class Main
{
	public static void main(String[] args) {
		
		Figure figure = new Figure("blue");
		System.out.println(figure.area());
		Square square = new Square("red", 5);
		System.out.println(square.area());
		Circle circle = new Circle("green", 7);
		System.out.println(circle.area());
		}
}
