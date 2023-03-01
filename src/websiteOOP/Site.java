package websiteOOP;

import java.util.Scanner;
import java.util.Arrays;

public class Site extends Repository {

    public void start() {
        register100Users();

        while (true) {
            int ID = checkLogin();
            switch (chooseRequest()) {
                case "1" -> registerNewUser();
                case "2" -> {
                    if (getTypeUser(ID) instanceof Administrator)
                        getInfoByID();
                    else System.out.println("This request is available only for Administrator");
                }
                case "3" -> {
                    if (getTypeUser(ID) instanceof Administrator)
                        System.out.println("Info about Customers:\n" + (Arrays.deepToString(getCustomers())));   //Как-то можно вывести в столбец?
                    else System.out.println("This request is available only for Administrator");
                }
                case "4" -> {
                    if (getTypeUser(ID) instanceof Administrator)
                        System.out.println("Info about Suppliers:\n" + (Arrays.deepToString(getSuppliers())));
                    else System.out.println("This request is available only for Administrator");
                }
                case "5" -> getInfoAboutMyself(ID);
                case "6" -> {
                    if (getTypeUser(ID) instanceof Customer)
                        getListOrders(ID);
                    else System.out.println("This request is available only for Customer");
                }
                case "7" -> {
                    if (getTypeUser(ID) instanceof Supplier)
                        getListItems();
                    else System.out.println("This request is available only for Supplier");
                }
                case "8" -> System.out.println("Users summary: " + totalUser + "\n" + (Arrays.toString(getSummary())));
                case "END", "end", "End" -> {
                    return;
                }
                default -> System.out.println("You entered incorrect number");
            }
            System.out.println();
        }
    }

    private void register100Users(){
        generateLogin();
        generatePassword();
        generateID();
        generateName();
        generateAge();
        generateTypeUser();
        generateListOrders();
        generateListItems();
    }

    private int checkLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your login: ");  //ABCDEFGH
        while (true) {
            String currentLogin = scanner.nextLine();
            System.out.print("Enter your password: ");  //0123456789
            String currentPassword = scanner.nextLine();

            for (int i = 0; i < numberUsers; i++) {
                if (currentLogin.equals(login[i]) && currentPassword.equals(password[i])) {
                    System.out.println("Welcome to the database!");
                    return i;
                }
                else System.out.print("You entered incorrect login or password\n" +
                        "Enter your login: ");
                break;
            }
        }
    }

    private User getTypeUser(int i){
        return user[i];
    }

    //    private boolean checkEnd(){
//        Scanner scanner = new Scanner(System.in);
//        String end = scanner.nextLine();
//        return end.equals("END") || end.equals("End") || end.equals("end");
//    }                                                   //Как выводить бесконечно меню с такой проверкой?

    private String chooseRequest(){
        System.out.print("MENU:\n" +
                "1 - To register new User\n" +
                "2 - To get info by ID (only for Administrator)\n" +
                "3 - To get a list of Customers (only for Administrator)\n" +
                "4 - To get a list of Suppliers (only for Administrator)\n" +
                "5 - To get info about you\n" +
                "6 - To get a list of orders (only for Customer)\n" +
                "7 - To get a list of items (only for Supplier)\n" +
                "8 - To get Users summary: total Administrators, total Customers, total Suppliers\n" +
                "Enter a number from 1 to 8 according to your request: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private void registerNewUser(){
        totalUser++;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name of new User: ");
        String newName = scanner.nextLine();
        addNewName(newName);

        System.out.print("Enter an age of new User: ");
        int newAge = scanner.nextInt();
        addNewAge(newAge);

//        while(true){
//            System.out.print("Enter an age of new User: ");
//            int newAge = scanner.nextInt();
//            if (scanner.hasNextInt()) {
//                addNewAge(newAge);
//                break;
//            }
//            else
//                System.out.println("You entered not a number");
//        }                                             //Как здесь правильно сделать проверку?

        System.out.print("Choose a type of User:\n" +
                "1 - Administrator\n" +
                "2 - Customer\n" +
                "3 - Supplier\n" +
                "Enter a number from 1 to 3 according to the type showing above: ");
        int newTypeUser = scanner.nextInt();
        addNewTypeUser(newTypeUser);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a login of new User: ");
        String newLogin = scan.nextLine();
        addNewLogin(newLogin);

        System.out.print("Enter a password of new User: ");
        String newPassword = scan.nextLine();
        addNewPassword(newPassword);

        System.out.println("You've registered a new User with the following characteristics:\n" +
                "Name - " + addNewName(newName) + "\n"+
                "Age - " + addNewAge(newAge) + "\n"+
                "Type of User - " + addNewTypeUser(newTypeUser) + "\n"+
                "Login of User - " + addNewLogin(newLogin) + "\n"+
                "Password of User - " + addNewPassword(newPassword) + "\n"+
                "ID of User - " + addNewID()[totalUser-1]);
    }

    private String addNewName(String newName) {

        String[]addNewName = new String[totalUser];
        for (int i = 0; i < addNewName.length-1; i++) {
            addNewName[i] = name[i];
        }
        addNewName[addNewName.length-1] = newName;

        name = new String[totalUser];
        for (int i = 0; i < name.length; i++) {
            name[i]=addNewName[i];
        }
        return name[totalUser-1];
    }

    private int addNewAge(int newAge){
        int[]addNewAge = new int[totalUser];
        for (int i = 0; i < addNewAge.length-1; i++) {
            addNewAge[i] = age[i];
        }
        addNewAge[addNewAge.length-1] = newAge;

        age = new int[totalUser];
        for (int i = 0; i < age.length; i++) {
            age[i]=addNewAge[i];
        }
        return age[totalUser-1];
    }

    private User addNewTypeUser(int newTypeUser){
        User[]addNewTypeUser = new User[totalUser];
        for (int i = 0; i < addNewTypeUser.length-1; i++) {
            addNewTypeUser[i] = user[i];
        }
        switch (newTypeUser){
            case 1 -> addNewTypeUser[addNewTypeUser.length-1] = new Administrator();
            case 2 -> addNewTypeUser[addNewTypeUser.length-1] = new Customer();
            case 3 -> addNewTypeUser[addNewTypeUser.length-1] = new Supplier();
        }

        user = new User[totalUser];
        for (int i = 0; i < user.length; i++) {
            user[i] = addNewTypeUser[i];
        }
        return user[totalUser-1];
    }

    private String addNewLogin(String newLogin){
        String[]addNewLogin = new String[totalUser];
        for (int i = 0; i < addNewLogin.length-1; i++) {
            addNewLogin[i] = login[i];
        }
        addNewLogin[addNewLogin.length-1] = newLogin;

        login = new String[totalUser];
        for (int i = 0; i < login.length; i++) {
            login[i] = addNewLogin[i];
        }
        return login[totalUser-1];
    }

    private String addNewPassword(String newPassword){
        String[]addNewPassword = new String[totalUser];
        for (int i = 0; i < addNewPassword.length-1; i++) {
            addNewPassword[i] = password[i];
        }
        addNewPassword[addNewPassword.length-1] = newPassword;

        password = new String[totalUser];
        for (int i = 0; i < password.length; i++) {
            password[i] = addNewPassword[i];
        }
        return password[totalUser-1];
    }

    private int[] addNewID(){
        ID = new int[totalUser];
        for (int i = 0; i < ID.length; i++) {
            ID[i] = i;
        }
        return ID;
    }

}
