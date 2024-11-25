package getters_setters_8;

public class Employee {
    
    private String name;
    private int age;
    private int experience;                                     //8.1, 8.5
    
    public Employee(String name, int age, int experience){
        this.name = name;
        
        if (age>0 && age<100){
            this.age = age;
        }
        else {
            this.age = 0;
        }
        
        if (experience >= 0){
            this.experience = experience;
        }
        else {
            this.experience = 0;
        }
    }                                                           //8.2
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getExperience() {
        return experience;
    }                                                           //8.3
    

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
    
    public void setExperience(int experience) {
        if (experience >= 0){
            this.experience = experience;
        }
        else {
            this.experience = 0;
        }
    }                                                           //8.4

}