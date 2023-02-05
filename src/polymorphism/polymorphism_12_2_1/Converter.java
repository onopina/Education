package polymorphism.polymorphism_12_2_1;

import java.util.Scanner;

public class Converter {

    public static void convert(){
        Currency currency;
        Scanner scanner = new Scanner(System.in);
            while (true){
            System.out.print("Enter 'DOLLAR' or 'EURO': ");
            String input = scanner.nextLine();
            if (input.equals("DOLLAR") || input.equals("dollar") || input.equals("Dollar")) {
                currency = new Dollar();
                System.out.println(currency.exchangeToRub());
                break;                          // Как здесь обойтись без break? Чтобы сохранилась логика
            } else if (input.equals("EURO") || input.equals("euro") || input.equals("Euro")) {
                currency = new Euro();
                System.out.println(currency.exchangeToRub());
                break;
            }
            else {
                System.out.println("You enter incorrect currency");
            }
        }

    }

}
