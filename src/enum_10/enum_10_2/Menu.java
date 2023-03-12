package enum_10.enum_10_2;

import java.util.Scanner;

public class Menu {

    public void createPerson(){
        Person person;
        System.out.print("Enter a name of a Person: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Enter an age of the Person: ");
        int age = scanner.nextInt();
        while (true){
            System.out.print("Enter a gender of the Person (MALE or FEMALE): ");
            Scanner scanner1 = new Scanner(System.in);
            String gender = scanner1.nextLine();
            Gender male = Gender.MALE;
            Gender female = Gender.FEMALE;
            if (gender.equals(male.name())) {
                person = new Person(name, age, Gender.MALE);
                break;
            }
            else if (gender.equals(female.name())) {
                person = new Person(name, age, Gender.FEMALE);
                break;
            }
            else System.out.println("You entered an incorrect gender");
        }
        System.out.println("You created the Person with next characteristics: " + person);
    }
}
