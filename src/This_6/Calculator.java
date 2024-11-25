package this_6;

/**
 * Часть 2:
 * Написать класс Калькулятор. Не добавлять полей.
 * Создать метод sum, который принимает 2 параметра int. Возвращает (return) сумму их значений.
 * Перегрузить метод sum так, чтобы он принимал 3 параметра int и делал то же самое, что и предыдущий вариант.
 * Перегрузить метод sum так, чтобы он работал с двумя параметрами типа double. Считал их сумму и возвращал (return).
 * Добавить еще три метода: вычитание, деление, умножение. Методы работают с двумя параметрами int.
 */
public class Calculator {
    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public double add(double num1, double num2){
        return num1 + num2;
    }
    public int sub(int num1, int num2){
        return num1 - num2;
    }
    public int mul(int num1, int num2){
        return num1 * num2;
    }
    public int div(int num1, int num2){
        return num1 / num2;
    }
}
