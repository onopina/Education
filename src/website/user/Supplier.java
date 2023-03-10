package website.user;

public class Supplier extends User{
    private String[][] items;

    public Supplier(int id, String login, String password, String[][] items) {
        super(id, login, password);
        this.items = items;
    }

    @Override
    public String toString() {
        return "Supplier ID #" + getId();
    }

    public String[][] getItems() {
        return items;
    }
}
