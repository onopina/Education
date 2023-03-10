package website.site;

import website.repository.Repository;
import website.user.Administrator;
import website.user.Customer;
import website.user.Supplier;
import website.user.User;

import java.util.Arrays;
import java.util.Scanner;

public class Site {


    private Repository repository = new Repository();
    private int currentID;
    private User currentUser;

    public User getCurrentUser() {
        return currentUser;
    }

    public void checkLogin(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter your login: ");  //user0
            String currentLogin = scanner.nextLine();
            System.out.print("Enter your password: ");  //password0
            String currentPassword = scanner.nextLine();

            for (int i = 0; i < repository.getUsers().length; i++) {
                if (repository.getUsers()[i] != null && currentLogin.equals(repository.getUsers()[i].getLogin()) && currentPassword.equals((repository.getUsers()[i].getPassword()))) {
                    System.out.println("Welcome to the database!");
                    currentID = repository.getUsers()[i].getId();
                    currentUser = repository.getUsers()[i];
                    return;
                }
            }
            System.out.println("You entered incorrect login or password");
        }
    }

    public void registerUsers(){
        repository.generateUsers();
    }
    public void registerNewUser(){
        int id = repository.getSize();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a login of new User: ");
        String login = scanner.nextLine();
        System.out.print("Enter a password of new User: ");
        String password = scanner.nextLine();
        System.out.println("""
                Enter a type of new User:
                1 - Administrator
                2 - Customer
                3 - Supplier""");
        int type = scanner.nextInt();
        switch (type){
            case 1 -> repository.addNewUser(new Administrator(id, login, password));
            case 2 -> repository.addNewUser(new Customer(id, login, password, new String[]{"order"+id}));
            case 3 -> repository.addNewUser(new Supplier(id, login, password, new String[][]{{"item"+id, "$5"}}));
        }
        System.out.println("You've registered a new User:");
        repository.getInfo(id);
    }

    public void showInfoByID(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID number to get info about a User: ");
        int id = scanner.nextInt();
        if (id < repository.getSize()) repository.getInfo(id);
        else if (id >= repository.getSize()) System.out.println("There is no User with this ID");
    }

    public void showListCustomers(){
        System.out.println("The list of Customers: " + Arrays.toString(repository.getCustomers()));
    }
    public void showListSuppliers(){
        System.out.println("The list of Suppliers: " + Arrays.toString(repository.getSuppliers()));
    }
    public void showInfoAboutMyself(){
        repository.getInfo(currentID);
    }
    public void showSummary(){
        System.out.println("Total Administrators: " + repository.getSummary()[0]);
        System.out.println("Total Customers: " + repository.getSummary()[1]);
        System.out.println("Total Suppliers: " + repository.getSummary()[2]);
        System.out.println("Total Users: " + (repository.getSize()+1));
    }
    public void showOrdersCustomer(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an ID number of a Customer: ");
        int id = scanner.nextInt();
        if (repository.getUsers()[id] instanceof Customer) {
            System.out.println("The list of orders of the Customer ID #" + id + ":");
            System.out.println(Arrays.toString(repository.getOrdersCustomer(id)));
        }
        else System.out.println("This User is not a Customer");
    }
    public void showItemsSupplier(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an ID number of a Supplier: ");
        int id = scanner.nextInt();
        if (repository.getUsers()[id] instanceof Supplier) {
            System.out.println("The list of items of the Supplier ID #" + id + ":");
            System.out.println(Arrays.deepToString(repository.getItemsSupplier(id)));
        }
        else System.out.println("This User is not a Supplier");
    }




}
