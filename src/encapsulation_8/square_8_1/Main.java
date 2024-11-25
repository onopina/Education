package encapsulation_8.square_8_1;

/**
 * Часть 1:
 * Разработать программу в соответствии с принципом инкапсуляции:
 * Дан класс Квадрат. Есть поле – сторона. Добавить конструктор. Добавить методы: подсчет площади, подсчет периметра.
 * При использовании объекта класса Квадрат необходим функционал для получения и изменения его стороны.
 */
public class Main {
	public static void main(String[] args) {

		Square square = new Square(5);
		square.setSide(7);
		System.out.println("The area of the square whose side is " +
				square.getSide() + "cm is " + square.area() + "cm2");
		System.out.println("The perimeter of the square whose side is " +
				square.getSide() + "cm is " + square.perimeter() + "cm2");
		}

}

