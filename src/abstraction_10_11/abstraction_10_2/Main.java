package abstraction_10_11.abstraction_10_2;

/**
 * 2.	Переписать пример с классами Валюта, Доллар и Евро в соответствии с принципом абстракции.
 *  У Валюты есть поле курс, у дочерних классов полей нет.
 *  Также необходим метод: перевести определенное количество валюты по курсу
 *  (как в задании по наследованию).
 */
public class Main {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(68.37);
        System.out.println(dollar.exchangeToRub(100.50));
        Euro euro = new Euro(72.65);
        System.out.println(euro.exchangeToRub(150.00));
    }
}
