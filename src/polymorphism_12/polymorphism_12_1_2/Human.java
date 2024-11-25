package polymorphism_12.polymorphism_12_1_2;

import java.util.Scanner;

public class Human {
    private String name;
    private int age;
    Animal animal;


    public Human(String name, int age, Animal animal) {
        this.name = name;
        this.age = age;
        this.animal = animal;
    }

    public String toString(){
        return "Human{name='" + name + "'" + ", age=" + age + ", animal=" + animal.getClass().getSimpleName() + '}';
    }

    public static void createAnimal(){
        Animal animal = new Animal();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 'Dog' / 'Cat' / 'Fish': ");
        String choice = scanner.nextLine();
        switch (choice){
            case "Dog" -> animal = new Dog();
            case "Cat" -> animal = new Cat();
            case "Fish" -> animal = new Fish();
            default -> System.out.println("There is no such animal");
        }

        Human human = new Human("Max", 25, animal);
        System.out.println(human);
    }



}

