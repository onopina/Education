package polymorphism.polymorphism_12_1_3;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        Sayer.getAnimal(dog);
        Sayer.getAnimal(cat);
        Sayer.getAnimal(fish);
    }
}
