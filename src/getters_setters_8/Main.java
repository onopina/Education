package getters_setters_8;

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
