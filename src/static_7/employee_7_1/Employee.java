package static_7.employee_7_1;

public class Employee {
    public String name;
    public int age;
    public String gender;                                                        //7.1.1

    public static int countEmployees;                                            //7.1.4
    public static int countWomen;
    public static int countMen;                                                  //7.1.5

    public Employee (String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        countEmployees++;
        if (gender == "woman")
            countWomen++;
        else
            countMen++;
    }

    public Employee (String name, String gender){
        this.name = name;
        age = 18;
        this.gender = gender;
        countEmployees++;
        if (gender == "woman")
            countWomen++;
        else
            countMen++;
    }                                                                      //7.1.3

    public Employee(){
        age = 18;
        countEmployees++;
        if (gender == "woman")
            countWomen++;
        else
            countMen++;
    }                                                                      //7.1.2

    public void introduce(){
        System.out.println(name + ", " + age + ", " + gender);
    }

    public static void summary(){
        System.out.println("The number of employees is " + Employee.countEmployees + ", of which " +
                Employee.countWomen + " woman and " + Employee.countMen + " men");
    }

}
