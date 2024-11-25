package lambda_31.lambda_2_1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 1.	Дан класс Person (name, age). Реализовать сортировку по возрасту, а в случае равенства возрастов – по имени.
 * Реализовать двумя способами: через обычные реализацию компаратора и через Comparator.comparing().thenComparing().
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Petr", 18);
        Person person2 = new Person("Maria", 20);
        Person person3 = new Person("Vasya", 20);
        Person person4 = new Person("Olga", 21);
        Person person5 = new Person("Sveta", 19);
        Person person6 = new Person("Sveta", 20);

        Set<Person> students1 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() == o2.getAge())
                    return o1.getName().compareTo(o2.getName());
                return o1.getAge()-o2.getAge();
            }
        });

        students1.add(person1);
        students1.add(person2);
        students1.add(person3);
        students1.add(person4);
        students1.add(person5);
        students1.add(person6);

        System.out.println(students1);

        //Another way:
        Comparator<Person> comparator = Comparator.comparing(Person::getAge).thenComparing(Person::getName);

        Set<Person> students2 = new TreeSet<>(comparator);

        students2.add(person1);
        students2.add(person2);
        students2.add(person3);
        students2.add(person4);
        students2.add(person5);
        students2.add(person6);

        System.out.println(students2);
    }
}
