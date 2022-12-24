package inheritance_9_2_1;

public class Main
{
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Maria", 30);
		employee1.printClassName();
		Doctor doctor1 = new Doctor("Kate", 35, "Otolaryngologist");
		doctor1.printClassName();
		Programmer programmer1 = new Programmer("Helen", 40, 5);
		programmer1.printClassName();
		
	}
}
