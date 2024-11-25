package presentation.generics;

public class Account implements Comparable<Account>{
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }
    //    @Override
//    public int compareTo(Account o) {
//        if (this.balance > o.balance)
//            return 1;
//        else if (this.balance < o.balance)
//            return -1;
//        else
//            return 0;
//    }


    @Override
    public int compareTo(Account o) {
        return Integer.compare(this.balance, o.balance);
    }
}
