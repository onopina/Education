package exception_12.exception_12_3;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        try{
            if (name.length()>10){
                throw new IncorrectInfoException("You entered incorrect name");
            }
            if (name.contains(" ")){
                throw new IncorrectInfoException("You should enter only first name (without second name)");
            }
            else this.name = name;

            if (age<0 || age>100){
                throw new IncorrectInfoException("Age should be from 1 to 100");
            }
            else this.age = age;
        }
        catch (IncorrectInfoException e){
            System.out.println(e.getMessage());
        }
    }

    public void setName(String name) {
        try{
            if (name.length()>10){
                throw new IncorrectInfoException("You entered incorrect name");
            }
            if (name.contains(" ")){
                throw new IncorrectInfoException("You should enter only first name (without second name)");
            }
            else this.name = name;
        }
        catch (IncorrectInfoException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void setAge(int age) {
        try{
            if (age<0 || age>100){
                throw new IncorrectInfoException("Age should be from 1 to 100");
            }
            else this.age = age;
        }
        catch (IncorrectInfoException ex){
            System.out.println(ex.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
