package inheritance_9.inheritance_9_2_3;

/**
 * Часть 3:
 * 1.	Реализовать наследование классов: Валюта (поле - курс к рублю), Доллар, Евро (не имеют собственных полей).
 * 2.	Добавить конструкторы в три класса для инициализации поля.
 * 3.	Добавить метод в класс Валюта: перевести переданное количество валюты (параметр метода)
 *  в рубли по заданному курсу.
 * 4.	Переопределить метод из 3 пункта для классов Доллар и Евро.
 */
public class Main
{
	public static void main(String[] args) {
		
		Dollar dollar = new Dollar(71.17);
		System.out.println(dollar.exchangeToRub(100.50));
		Euro euro = new Euro(76.06);
		System.out.println(euro.exchangeToRub(150.00));
		
	}
}
