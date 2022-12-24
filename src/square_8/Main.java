package square_8;

public class Main
{
	public static void main(String[] args) {

		Square square = new Square(5);
		square.setSide(7);
		System.out.println("The area of the square whose side is " + square.getSide() + "cm is " + square.area() + "cm2");
		System.out.println("The perimeter of the square whose side is " + square.getSide() + "cm is " + square.perimeter() + "cm2");
		}

}

