package website.menu;

import website.site.Site;
import website.user.Administrator;

import java.util.Scanner;

public class Menu {
    private Site site = new Site();
    public void start(){
        site.registerUsers();
        while (true){
            site.checkLogin();
            showMenu();
            useMenu();
        }
    }

    private void showMenu(){
        System.out.println("""
                MENU:
                1 - To register a new User 
                2 - To get info by ID (only for Administrator)
                3 - To get a list of Customers (only for Administrator)
                4 - To get a list of Suppliers (only for Administrator)
                5 - To get info about you
                6 - To get a list of orders of a Customer
                7 - To get a list of items of a Supplier
                8 - To get Users summary: total Administrators, total Customers, total Suppliers
                """);
    }
    private void useMenu(){
        System.out.print("Enter a number from 1 to 8 according to your request: ");
        Scanner scanner = new Scanner(System.in);
        String request = scanner.nextLine();
        switch (request){
            case "1" -> site.registerNewUser();
            case "2" -> {
                if (site.getCurrentUser() instanceof Administrator)
                site.showInfoByID();
                else System.out.println("This request is available only for Administrator");
            }
            case "3" -> {
                if (site.getCurrentUser() instanceof Administrator)
                site.showListCustomers();
                else System.out.println("This request is available only for Administrator");
            }
            case "4" -> {
                if (site.getCurrentUser() instanceof Administrator)
                site.showListSuppliers();
                else System.out.println("This request is available only for Administrator");
            }
            case "5" -> site.showInfoAboutMyself();
            case "6" -> site.showOrdersCustomer();
            case "7" -> site.showItemsSupplier();
            case "8" -> site.showSummary();
            case "END", "end", "End" -> System.exit(0);
            default -> System.out.println("You entered an incorrect number");
        }
    }
}
