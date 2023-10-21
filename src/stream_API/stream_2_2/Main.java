package stream_API.stream_2_2;

import java.util.Arrays;

/**
 * 2.	Дан массив Person[]. Проверить, что все люди являются совершеннолетними.
 * Реализовать двумя способами: через обычный for, через stream.
 */
public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Dima", 25),
                new Person("Vasya", 18),
                new Person("Sveta", 21),
                new Person("Masha", 35),
                new Person("Katya", 10),
        };

        System.out.println(checkAdults1(people));

        System.out.println(checkAdults2(people));
    }

    public static boolean checkAdults1(Person[] people){
        for (Person person : people) {
            if (person.getAge() < 18)
                return false;
        }
        return people.length != 0;
    }

    public static boolean checkAdults2(Person[] people){
        if (Arrays.stream(people)
                .map(Person::getAge)
                .min(Integer::compare)
                .orElse(0) < 18)
            return false;
        else return true;
    }
}
