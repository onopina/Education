package stream_API.stream_2_3;

import java.util.Arrays;

/**
 * 3.	Дан массив Person[]. Проверить, что хотя бы один из людей является совершеннолетним.
 * Реализовать двумя способами: через обычный for, через stream.
 */
public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Dima", 15),
                new Person("Vasya", 8),
                new Person("Sveta", 10),
                new Person("Masha", 35),
                new Person("Katya", 22),
        };

        System.out.println(checkAdults1(people));

        System.out.println(checkAdults2(people));
    }

    public static boolean checkAdults1(Person[] people){
        for (Person person : people) {
            if (person.getAge() >= 18){
                return true;
            }
        }
        return false;
    }

    public static boolean checkAdults2(Person[] people){
        return Arrays.stream(people)
                .map(Person::getAge)
                .anyMatch(x -> x >= 18);
    }
}
