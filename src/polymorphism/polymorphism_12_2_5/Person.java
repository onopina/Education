package polymorphism.polymorphism_12_2_5;

public class Person {

    String name;

    public Person(String name) {
        this.name = name;
        printInfo();
    }

    private void printInfo(){
        System.out.println("PrintInfo from Person");
        System.out.println(name.toUpperCase());
    }
}
