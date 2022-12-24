package inheritance_9_1_1;

public class Employee {
    
    private String name;
    private int age;
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
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