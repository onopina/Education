package inheritance_9.inheritance_9_3_1;

import inheritance_9.inheritance_9_3_1.person1.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        inheritance_9.inheritance_9_3_1.person2.Person person2 = new inheritance_9.inheritance_9_3_1.person2.Person();
        person1.print();
        person2.print();
    }
}



