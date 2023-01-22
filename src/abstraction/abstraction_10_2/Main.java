package abstraction.abstraction_10_2;

public class Main {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(68.37);
        System.out.println(dollar.exchangeToRub(100.50));
        Euro euro = new Euro(72.65);
        System.out.println(euro.exchangeToRub(150.00));
    }
}
