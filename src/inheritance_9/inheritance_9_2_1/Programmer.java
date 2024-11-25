package inheritance_9.inheritance_9_2_1;

public class Programmer extends Employee {
    
    private int experience;
    
    public Programmer(String name, int age, int experience){
        super(name, age);
        this.experience = experience;
    }
    
    public void printClassName() {
         System.out.println("Class Programmer");
     }
    
}