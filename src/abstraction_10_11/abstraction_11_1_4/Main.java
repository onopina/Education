package abstraction_10_11.abstraction_11_1_4;

/**
 * 4.	Написать интерфейс Producer.
 *  Класс, реализующий интерфейс, должен работать следующим образом:
 *  в зависимости от текущего состояния объект класса, метод produce (метод интерфейса)
 *  должен выдавать случайное число или число, введенное с клавиатуры.
 */
public class Main {
    public static void main(String[] args) {

        Number number = new Number();
        number.produce(1);
    }
}
