package websiteOOP;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Repository {

    public static int numberUsers = 100;  //Исходное кол-во пользователей
    public int totalUser = numberUsers;  //Текущее кол-во пользователей
    public User[]user = new User[numberUsers];

    public String[]name = new String[numberUsers];
    public int[]age = new int[numberUsers];
    public String[]login = new String[numberUsers];
    public String[]password = new String[numberUsers];
    public int[]ID = new int[numberUsers];
    private String[]order = new String[totalUser];
    private String[]item = new String[totalUser];

    public String[] generateLogin(){
        char[][]symbols = new char[numberUsers][8];  //логин из 8-ми символов

        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < symbols[i].length; j++) {
                symbols[i][j] = (char) (65 + i + j);
            }
            login[i] = String.valueOf(symbols[i]);
        }
        return login;
    }   //Сгенерировать 100 логинов

    public String[] generatePassword(){
        int n = 0;
        int[][]numbers = new int[10][10];  //пароль из 10-ти цифр

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i + j < 10) {
                    numbers[i][j] = i + j;
                }
                if (i + j >= 10) {
                    numbers[i][j] = n;
                    n++;
                }
                password[i] = Arrays.toString(numbers[i]).replaceAll("\\[|]", "").replaceAll(",", "").replaceAll(" ","");
            }
            n=0;
        }
        for (int i = 10; i < password.length; i++) {
            password[i]=password[i-10];
        }
        for (int i = 0; i < password.length; i++) {
         //   System.out.print(i + " ");
         //   System.out.println(password[i]);
        }
        return password;
    }   //Сгенерировать 100 паролей

    public int[] generateID(){
        for (int i = 0; i < numberUsers; i++) {
            ID[i] = i;
        }
        return ID;
    }   //Сгенерировать 100 ID

    public String[] generateName(){

        String[]randomNames = {"Mike", "Helen", "Kate", "Max", "Alex"};

        for (int i = 0; i < 5; i++) {
            name[i] = randomNames[i];
        }
        for (int i = 5; i < numberUsers; i++) {
            name[i] = name[i-5];
        }
        return name;
    }   //Сгенерировать имена

    public int[] generateAge() {

        Random random = new Random();
        for (int i = 0; i < numberUsers; i++) {
            age[i] = random.nextInt(25,60);
        }
        return age;
    }   //Сгенерировать возраст

    public User[] generateTypeUser(){
        for (int i = 0; i < numberUsers; i++) {
            for(i=0; i<5; i++){
                user[i] = new Administrator();   //0-4 Администраторы
            }
            for(i=5; i<35; i++){
                user[i] = new Customer();   //5-34 Заказчики
            }
            for(i=35; i<100; i++){
                user[i] = new Supplier();   //35-99 Поставщики
            }
        }
        return user;
    }   //Сгенерировать категории пользователей

    public String[] generateListOrders(){
        String[]randomOrders = {"Coffee", "Phone", "Shorts", "Shoes", "Pencil", "Cup", "Soap", "Shampoo", "Ski boots", "Gloves"};
        Random random = new Random();
        for (int i = 0; i < user.length; i++) {
            if (user[i] instanceof Customer){
                order[i] = randomOrders[random.nextInt(randomOrders.length)] + ", " + randomOrders[random.nextInt(randomOrders.length)] + ", " + randomOrders[random.nextInt(randomOrders.length)];            }
        }
        return order;
    }

    public String[] generateListItems() {
        Random random = new Random();
        String[][] randomItems = new String[10][2];
        String[] randomOrders = {"Coffee", "Phone", "Shorts", "Shoes", "Pencil", "Cup", "Soap", "Shampoo", "Ski boots", "Gloves"};
        for (int i = 0; i < randomItems.length; i++) {
            randomItems[i][0] = randomOrders[i];
            randomItems[i][1] = String.valueOf(random.nextDouble(50));
        }

        for (int i = 0; i < user.length; i++) {
            if (user[i] instanceof Supplier){
                int item1 = random.nextInt(randomItems.length);
                int item2 = random.nextInt(randomItems.length);
                int item3 = random.nextInt(randomItems.length);
                item[i] = randomItems[item1][0] + ", price $" + randomItems[item1][1] + "; " + randomItems[item2][0] + ", price $" + randomItems[item2][1] + "; " + randomItems[item3][0] + ", price $" + randomItems[item3][1] + "; ";
            }
        }
        return item;
    }

    public void getInfoByID(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter ID number to get info about User: ");
            int ID = scanner.nextInt();
            if (ID>=0 && ID<totalUser) {
                for (int i = 0; i < totalUser; i++) {
                    if (ID == i) {
                        System.out.println("The User with ID #" + ID + " has the following characteristics:\n" +
                                "Name - " + name[i] + "\n" +
                                "Age - " + age[i] + "\n" +
                                "Type of User - " + user[i] + "\n" +
                                "Login of User - " + login[i] + "\n" +
                                "Password of User - " + password[i]);
                    }
                }
                break;
            }
            else System.out.println("There is no User with this ID");
        }
    }

    public String[][] getCustomers(){
        int size = 0;
        for (User value : user) {
            if (value instanceof Customer){
                size++;
            }
        }
        String[][]customer = new String[size][5];   //5 столбцов: ID, имя, возраст, логин, пароль
        for (int i = 0, j=0; i < user.length; i++) {
            if (user[i] instanceof Customer){
                customer[j][0] = String.valueOf(ID[i]);
                customer[j][1] = name[i];
                customer[j][2] = String.valueOf(age[i]);
                customer[j][3] = login[i];
                customer[j][4] = password[i];
                j++;
            }
        }
        return customer;
    }

    public String[][] getSuppliers(){
        int size = 0;
        for (User value : user) {
            if (value instanceof Supplier){
                size++;
            }
        }
        String[][]supplier = new String[size][5];   //5 столбцов: ID, имя, возраст, логин, пароль
        for (int i = 0, j=0; i < user.length; i++) {
            if (user[i] instanceof Supplier){
                supplier[j][0] = String.valueOf(ID[i]);
                supplier[j][1] = name[i];
                supplier[j][2] = String.valueOf(age[i]);
                supplier[j][3] = login[i];
                supplier[j][4] = password[i];
                j++;
            }
        }
        return supplier;
    }   //Как эти два метода реализовать в одном? Передавая в переменную тип пользователя

    public void getInfoAboutMyself(int currentID) {
        for (int i = 0; i < user.length; i++) {
            if (currentID == i) {
                System.out.println("Info about you:\n" +
                        "ID - " + ID[i] + "\n" +
                        "Name - " + name[i] + "\n" +
                        "Age - " + age[i] + "\n" +
                        "Type of User - " + user[i] + "\n" +
                        "Login of User - " + login[i] + "\n" +
                        "Password of User - " + password[i]);
            }
        }
    }

    public void getListOrders(int currentID){
        for (int i = 0; i < totalUser; i++) {
            if (currentID == i) {
                System.out.println("The orders of the Customer ID #" + ID[i] + ": " + order[i]);
            }
        }
    }

    public void getListItems(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID: ");
        int currentID = scanner.nextInt();
        for (int i = 0; i < totalUser; i++) {
            if (currentID == i){
                System.out.println("The items of the Supplier ID #" + ID[i] + ": " + item[i]);
            }
        }
    }

    public String[] getSummary(){
        int totalAdmins = 0;
        int totalCustomers = 0;
        int totalSuppliers = 0;
        for (int i = 0; i < user.length; i++) {
            if (user[i] instanceof Administrator)
                totalAdmins++;
            else if (user[i] instanceof Customer)
                totalCustomers++;
            else if (user[i] instanceof Supplier)
                totalSuppliers++;
        }
        String[]summary = {"Total Administrators: "+totalAdmins, "Total Customers: "+totalCustomers, "Total Suppliers: "+totalSuppliers};
        return summary;
    }

}
