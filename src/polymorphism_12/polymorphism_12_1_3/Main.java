package polymorphism_12.polymorphism_12_1_3;

/**
 * 3.	На основании предыдущей задачи: создать три разных объекта (Dog, Cat, Fish).
 * Реализовать следующую логику: написать статический метод (или методы),
 * который принимает необходимое животное и вызывает у него метод say (добавить данный метод в классы).
 */
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
