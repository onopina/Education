package polymorphism_12.polymorphism_12_2_3;

/**
 * Часть 3:
 * Дано 3 формулы:
 * X + 1
 * X^2 + X + 1
 * X^3 + X^2 + X + 1
 *
 * Определить интерфейс Polynomial, добавить в него метод evaluate(int x).
 * Переопределить данный метод в трех наследниках (для каждой формулы свой класс).
 * Далее происходит выбор формулы: 1, 2 или 3 (вводится число в консоль):
 *
 * Создать соответствующий объект, рассчитать формулу.
 */
public class Main {
    public static void main(String[] args) {
        Evaluator.evaluateFormula(5);
    }
}
