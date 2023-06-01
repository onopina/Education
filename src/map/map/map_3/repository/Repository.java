package map.map.map_3.repository;

import map.map.map_3.user.User;

import java.util.*;

public class Repository {

    private Map<String, User> users = new HashMap<>();

    private String currentLogin;

    public void registerUsers(){
        for (int i = 0; i < 10; i++) {
            users.put("user"+i, new User(i,"user"+i, "password"+i));
        }
    }

    public boolean checkLogin(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your login: ");
        currentLogin = scanner.nextLine();
        return users.containsKey(currentLogin);
    }

    public boolean checkPassword(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        return password.equals(users.get(currentLogin).getPassword());
    }

    public void getInfoAboutUser(){
        System.out.println("Your ID: " + users.get(currentLogin).getId());
        System.out.println("Your login: " + users.get(currentLogin).getLogin());
        System.out.println("Your password: " + users.get(currentLogin).getPassword());
    }

    public void addNewUser(){
        System.out.println("This login is not found. You need to register");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your login for registration: ");
            String login = scanner.nextLine();
            if (users.containsKey(login)){
                System.out.println("This login is already in use");
            }
            else {
                System.out.print("Enter your password: ");
                String password = scanner.nextLine();
                users.put(login, new User(users.size(), login, password));
                return;
            }
        }
    }

    public int getTotalNumber(){
        return users.size();
    }

    public List<Integer> getUsersID(){
        List<Integer> listID = new ArrayList<>();
        for (User value : users.values()){
            listID.add(value.getId());
        }
        return listID;
    }

    public Set<String> getUsersLogins(){
        return users.keySet();
    }
}
