package inheritance_9.inheritance_9_3_1;

import inheritance_9.inheritance_9_3_1.person1.Person;

/**
 * 1.	Создать два класса с названием Person (именно такое).
 *  В первый класс добавить метод print, который выводит «Первый класс».
 *  Во второй класс добавить метод print, который выводит «Второй класс».
 *  Создать два объекта разных классов Person, вызвать метод print.
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        inheritance_9.inheritance_9_3_1.person2.Person person2 = new inheritance_9.inheritance_9_3_1.person2.Person();
        person1.print();
        person2.print();
    }
}



