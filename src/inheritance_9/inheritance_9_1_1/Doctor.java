package inheritance_9.inheritance_9_1_1;

public class Doctor extends Employee {
    
    private String specialization;
    
    public String getSpecialization() {
        return specialization;
    }
    
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
     public void printClassName() {
         System.out.println("Class Doctor");
     } 
    
}