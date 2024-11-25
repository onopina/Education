package abstraction_10_11.abstraction_11_2_1;

/**
 * 1.	Дан абстрактный класс или интерфейс Service.
 *  Необходимо добавить в него следующие методы: create (создать объект),
 * makeString (привести объект к строке), clear (все поля объекта сделать null).
 */
public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        array.create();
        array.makeString();
        array.clear();
        array.makeString();

    }
}
