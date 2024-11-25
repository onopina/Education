package presentation.generics;

public class Main1 {
    public static void main(String[] args) {
        Account account = new Account(49);
        Account account1 = new Account(50);

        System.out.println(account.compareTo(account1));

    }
}
