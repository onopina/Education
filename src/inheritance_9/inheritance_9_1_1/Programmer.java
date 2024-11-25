package inheritance_9.inheritance_9_1_1;

public class Programmer extends Employee {
    
    private int experience;
    
    public int getExperience() {
        return experience;
    }
    
    public void setExperience(int experience) {
        if (experience >= 0){
            this.experience = experience;
        }
        else {
            this.experience = 0;
        }
    }
    
    public void printClassName() {
         System.out.println("Class Programmer");
     }
    
}