package this_6;

/**
 * Часть 1 (не использовать this):
 * Написать класс Person. Добавить поля имя и возраст.
 * Добавить пустой конструктор.
 * Добавить конструктор для задания поля Имя.
 * Добавить конструктор для задания двух полей сразу.
 */
public class Person {
    String name;
    int age;

    public Person(){
    }

    public Person(String n){
        name = n;
    }

    public Person(String n, int a){
        name = n;
        age = a;
    }
}
