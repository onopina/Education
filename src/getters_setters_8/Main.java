package getters_setters_8;

/**
 * Создать класс Работник.
 * 1.	Добавить поля: имя, возраст, стаж работы.
 * 2.	Добавить конструктор для 3-ех полей. В конструктор добавить два условия:
 *  назначать возраст нужно только в том случае, если он строго больше нуля и меньше 100,
 *  назначать стаж работы нужно, если он не отрицательный.
 * 3.	Добавить геттеры для трех полей.
 * 4.	Добавить сеттеры для трех полей.
 *  В сеттеры для возраста и стажа работы добавить аналогичные условия из конструктора.
 * 5.	Ограничить прямой доступ к полям класса – указать им модификатор private.
 * 6.	Создать объект. Изменить его возраст на возраст + 1, стаж работы на стаж работы + 2.
 * 7.	Вывести на консоль имя, обновленный возраст и обновленный стаж работы.
 */
public class Main {
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Max", 35, 12);
		System.out.println(employee1.getName() + ", " + employee1.getAge() + ", " + employee1.getExperience());
		
		employee1.setAge(36);
		employee1.setExperience(14);                                    //8.6      
	    String name = employee1.getName();
	    int age = employee1.getAge();
	    int experience = employee1.getExperience();
	    System.out.println(name + ", " + age + ", " + experience);      //8.7  
	    
	}
}
