package abstraction_10_11.abstraction_11_1_4;

import java.util.Scanner;

public class Number implements Producer{


    @Override
    public void produce(int option_1_or_2) {
        if (option_1_or_2 == 1) {
            System.out.print("Enter the max number of the range: ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("The random number is: " + (int)(Math.random()*scanner.nextInt()+1));
        }
        else if (option_1_or_2 == 2) {
            System.out.print("Enter the a number from 1 to 100: ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Your number is: " + scanner.nextInt());
        }
        else{
            System.out.println("Choose an option either 1 or 2");
        }
    }
}
