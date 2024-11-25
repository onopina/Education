package map_22_23.map.map_3.menu;

import map_22_23.map.map_3.repository.Repository;

import java.util.Scanner;

public class Menu {

    private Repository repository = new Repository();

    public void start(){
        repository.registerUsers();

        while (true) {
            if (repository.checkLogin()) {
                if (repository.checkPassword()){
                    repository.getInfoAboutUser();
                    break;
                }
            }
            else
                repository.addNewUser();
        }
        showMenu();
        useMenu();
    }

    private void showMenu(){
        System.out.println("""
                1 - To get a total number of Users
                2 - To get a list of User's ID
                3 - To get a list of User's logins
                """);
    }

    private void useMenu(){
        System.out.print("Enter a number from 1 to 3 according to your request: ");
        Scanner scanner = new Scanner(System.in);
        int request = scanner.nextInt();
        switch (request){
            case 1 -> System.out.println("Total Users: " + repository.getTotalNumber());
            case 2 -> System.out.println(repository.getUsersID());
            case 3 -> System.out.println(repository.getUsersLogins());
            default -> System.out.println("You entered an incorrect number");
        }
    }
}
