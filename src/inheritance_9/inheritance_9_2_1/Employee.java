package inheritance_9.inheritance_9_2_1;

public class Employee {
    
    public String name;
    public int age;
    
    public Employee (String name, int age){
        this.name = name;
        
        if (age>0 && age<100){
            this.age = age;
        }
        else {
            this.age = 0;
        }
    }
    
    public void printClassName() {
        System.out.println("Class Employee");
    } 
     
}       