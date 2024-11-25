package abstraction_10_11.abstraction_11_1_2;

/**
 * 2.	Описать контроллер космического корабля.
 *  Методы: увеличить скорость, уменьшить скорость, изменить угол полета.
 *  Написать класс Космический корабль, расширяющий интерфейс или абстрактный класс Контроллер
 *  (выбрать, что подходит лучше).
 */
public class Main {
    public static void main(String[] args) {

        SpaceShip ship = new SpaceShip(150, 45);
        ship.speedUp();
        ship.speedDown();
        ship.changeAngle(49);

    }
}
