package inheritance_9.inheritance_9_1_1;

/**
 * Часть 1:
 * 1.	Реализовать наследование классов: Employee, Doctor, Programmer.
 * 2.	 В Employee добавить два поля. В Doctor и Programmer добавить по одному собственному полю.
 * 3.	Добавить геттеры и сеттеры для всех полей.
 * 4.	Добавить в Employee метод, который выводит на консоль название класса.
 *  Переопределить данную логику в дочерних классах.
 */
public class Main {
	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.printClassName();
		Doctor doctor1 = new Doctor();
		doctor1.printClassName();
		Programmer programmer1 = new Programmer();
		programmer1.printClassName();
		
	}
}
