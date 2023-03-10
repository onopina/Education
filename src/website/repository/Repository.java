package website.repository;

import website.user.Administrator;
import website.user.Customer;
import website.user.Supplier;
import website.user.User;

import java.util.Arrays;

public class Repository {

    private int totalUsers = 110;
    private final User[]users = new User[totalUsers];

    public User[] getUsers() {
        return users;
    }

    public void generateUsers(){
        for (int i = 0; i < users.length; i++) {
            if (i < 5){
                users[i] = new Administrator(getSize(), "user"+i, "password"+i);
            }
            else if (i < 35){
                users[i] = new Customer(getSize(), "user"+i, "password"+i, new String[]{"order"+i+"a", "order"+i+"b", "order"+i+"c"});
            }
            else if (i < 100){
                users[i] = new Supplier(getSize(), "user"+i, "password"+i, new String[][]{{"item"+i+"a", "$5"}, {"item"+i+"b", "$15"}, {"item"+i+"c", "$25"}});
            }
        }
    }

    public void addNewUser(User user){
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null){
                users[i] = user;
                break;
            }
        }
    }

    public int getSize(){
        int size = 0;
        for (int i = 0; i < users.length; i++) {
            if(users[i] != null) {
                size=i+1;
            }
        }
        return size;
    }


    public void getInfo(int id){
        for (User user : users) {
            if (user != null && id == user.getId()) {
                System.out.println("ID of the User - " + user.getId());
                System.out.println("Login of the User - " + user.getLogin());
                System.out.println("Password of the User - " + user.getPassword());
                System.out.println("Type of the User - " + user);
                if (user instanceof Customer) System.out.println("The list of orders of the Customer: " + Arrays.toString(getOrdersCustomer(id)));
                if (user instanceof Supplier) System.out.println("The list of items of the Supplier: " + Arrays.deepToString(getItemsSupplier(id)));
            }
        }
    }

    public User[] getCustomers() {
        int size = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] instanceof Customer)
                size++;
        }
        User[] customers = new User[size];
        for (int i = 0, j=0; i < users.length; i++) {
            if (users[i] instanceof Customer) {
                customers[j] = users[i];
                j++;
            }
        }
        return customers;
    }
    public User[] getSuppliers() {
        int size = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] instanceof Supplier)
                size++;
        }
        User[] suppliers = new User[size];
        for (int i = 0, j=0; i < users.length; i++) {
            if (users[i] instanceof Supplier) {
                suppliers[j] = users[i];
                j++;
            }
        }
        return suppliers;
    }
    public int[] getSummary(){
        int totalAdmins = 0;
        int totalCustomers = 0;
        int totalSuppliers = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] instanceof Administrator)
                totalAdmins++;
            if (users[i] instanceof Customer)
                totalCustomers++;
            if (users[i] instanceof Supplier)
                totalSuppliers++;
        }
        return new int[]{totalAdmins, totalCustomers, totalSuppliers};
    }

    public String[] getOrdersCustomer(int id){
        String[]orders = new String[3];
        for (int i = 0; i < users.length; i++) {
            if (users[i] instanceof Customer && id == users[i].getId()){
                orders = ((Customer) users[i]).getOrders();
            }
        }
        return orders;
    }
    public String[][] getItemsSupplier(int id){
        String[][]items = new String[3][2];
        for (int i = 0; i < users.length; i++) {
            if (users[i] instanceof Supplier && id == users[i].getId()){
                items = ((Supplier) users[i]).getItems();
            }
        }
        return items;
    }

}
