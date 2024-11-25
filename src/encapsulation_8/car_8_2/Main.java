package encapsulation_8.car_8_2;

/**
 * Часть 2:
 * Разработать программу в соответствии с принципом инкапсуляции:
 * Дан класс Машина. Есть поля: марка, цвет, максимальная скорость.
 *  Поля задаются в конструкторе, а дальше их невозможно изменить (но можно получить).
 * Реализовать логику по движению машины – написать методы:
 *  завести машину, включить двигатель, нажать на газ, нажать на тормоз, заглушить машину, выключить двигатель.
 * С помощью методов, перечисленных выше, реализовать следующую логику: метод «поехать к месту назначения».
 */
public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "white", 220);
        car.drive();

    }
}