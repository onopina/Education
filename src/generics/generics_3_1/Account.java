package generics.generics_3_1;

public class Account implements Comparable<Account> {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    @Override
    public int compareTo(Account o) {
        return Integer.compare(this.balance, o.balance);
    }




}