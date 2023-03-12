package enum_10.enum_10_1;

import java.util.Scanner;

public class Menu {
    private Airplane airplane = new Airplane();
    private Condition[] values = Condition.values();

    public void start(){

        while (true){
            showMenu();
            useMenu();
        }
    }

    private void showMenu(){
        System.out.println("Enter a number from 0 to 3 choosing a condition of an Airplane:");
        for(Condition condition : values) {
            System.out.println(condition.ordinal() + " " + condition.name());
        }
    }

    private void useMenu(){
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        switch (choice){
            case "0" -> airplane.setCondition(Condition.PARKING);
            case "1" -> airplane.setCondition(Condition.TAKEOFF);
            case "2" -> {
                airplane.setCondition(Condition.FLYING);
                System.out.print("Enter a speed of the airplane: ");
                double speed = scanner.nextDouble();
                airplane.setSpeed(speed);
            }
            case "3" -> airplane.setCondition(Condition.LANDING);
            case "END", "end", "End" -> System.exit(0);
            default -> System.out.println("You entered an incorrect number");
        }
        System.out.println("The condition of the " + airplane.getName() + " is: " + airplane.getCondition());
        if (choice.equals("2")) System.out.println("The speed of the plane is: " + airplane.getSpeed() + " km per hour");
    }
}
