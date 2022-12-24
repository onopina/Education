package inheritance_9_2_1;

public class Doctor extends Employee {
    
    private String specialization;
    
    public Doctor(String name, int age, String specialization){
        super(name, age);
        this.specialization = specialization;
    }
    
     public void printClassName() {
         System.out.println("Class Doctor");
     } 
    
}