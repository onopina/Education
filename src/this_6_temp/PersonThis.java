package this_6;

/**
 * Часть 3 (все то же самое, что и Часть 1,
 *  но теперь для обращения к полям класса внутри метода или конструктора нужно использовать this):
 * Написать класс Person. Добавить поля имя и возраст.
 * Добавить пустой конструктор.
 * Добавить конструктор для задания поля Имя.
 * Добавить конструктор для задания двух полей сразу.
 */
public class PersonThis {

    String name;
    int age;

    public PersonThis(){
    }

    public PersonThis(String name){
        this.name = name;
    }

    public PersonThis(String name, int age){
        this.name = name;
        this.age = age;
    }
}
