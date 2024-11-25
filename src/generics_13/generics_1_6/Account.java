package generics_13.generics_1_6;

public class Account<T> {

    private T balance;

    public Account(T balance) {
        this.balance = balance;
    }
    public void showBalance(){
        System.out.println("Your balance is " + balance);
    }
}
