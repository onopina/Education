package website.user;

public class Administrator extends User{

    public Administrator(int id, String login, String password) {
        super(id, login, password);
    }

    @Override
    public String toString() {
        return "Administrator ID #" + getId();
    }
}
