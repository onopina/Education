package generics.generics_1_6;

/**
 * 6.	Создать класс, представляющий собой счет в банке.
 * Баланс счета может быть представлен в виде int, double или String.
 * В случае String: «1000 RUB» (пример), в случае int или double – просто целое или дробное число.
 */
public class Main {
    public static void main(String[] args) {
        Account<String> account = new Account<>("1000 RUB");
        account.showBalance();
        Account<Integer> account1 = new Account<>(1000);
        account1.showBalance();
        Account<Double> account2 = new Account<>(1000.49);
        account2.showBalance();
    }
}
