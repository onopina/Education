package inheritance_9.inheritance_9_2_2;

/**
 * Часть 2:
 * 1.	Реализовать наследование классов: Фигура, Квадрат, Круг.
 * 2.	Фигура имеет поле цвет. Квадрат и круг имеют собственные поля,
 *  которые характеризуют данную фигуру (поля, характеризующие квадрат; поля, характеризующие круг).
 * 3.	Добавить конструктор для инициализации всех полей в 3 классах.
 * 4.	Добавить метод в Фигуру, который считает ее площадь
 *  (в данном классе сделать return 0.0, так как Фигура – это что-то общее, нельзя ничего сказать про ее площадь).
 *  Переопределить логику нахождения площади в дочерних классах.
 */
public class Main
{
	public static void main(String[] args) {
		
		Figure figure = new Figure("blue");
		System.out.println(figure.getArea());
		Square square = new Square("red", 5);
		System.out.println(square.getArea());
		Circle circle = new Circle("green", 7);
		System.out.println(circle.getArea());
		}
}
