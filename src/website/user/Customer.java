package website.user;

public class Customer extends User{
    private String[]orders;

    public Customer(int id, String login, String password, String[] orders) {
        super(id, login, password);
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer ID #" + getId();
    }

    public String[] getOrders() {
        return orders;
    }
}
