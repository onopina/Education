package abstraction_10_11.abstraction_11_1_3;

/**
 * 3.	Написать Интерфейс «Состояние».
 *  Классы, которые реализуют данный интерфейс, должны поддерживать два режима работы: включен, выключен.
 *  Придумать два класса, которые могут работать в таком режиме.
 *  Переопределить метод интерфейса.
 */
public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone();
        Car car = new Car();
        phone.on();
        car.off();

    }
}
