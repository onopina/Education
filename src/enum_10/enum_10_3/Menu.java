package enum_10.enum_10_3;

import java.util.Scanner;

public class Menu {
    private Month[] months = Month.values();
    private Weekday[] weekdays = Weekday.values();

     public void createDate(){
         System.out.println("Enter an ordinal number of the month from 1 to 12: ");
         printMonths();
         Scanner scanner = new Scanner(System.in);
         int month = scanner.nextInt();
         System.out.println("Enter a day according the number of days per month: " + numberDays(month));
         int day = scanner.nextInt();
         System.out.print("Enter a year: ");
         int year = scanner.nextInt();
         System.out.println("Enter an ordinal number of the day of the week from 1 to 7: ");
         printWeekdays();
         int weekday = scanner.nextInt();
         Date date = new Date(createMonth(month), day, year, createWeekday(weekday));
         System.out.println("Your date is: " + date);
     }

    private void printMonths(){
        for(Month month : months){
            System.out.println(month.ordinal()+1 + " " + month.name());
        }
    }

    private int numberDays(int numberMonth){
        int numberDays = 0;
        for(Month month : months){
            if (month.ordinal() == numberMonth-1)
                numberDays = month.getDays();
        }
        return numberDays;
    }

    private void printWeekdays(){
        for(Weekday weekday : weekdays){
            System.out.println(weekday.ordinal()+1 + " " + weekday.name());
        }
    }

    private Month createMonth(int numberMonth){
        Month currentMonth = null;
        for(Month month : months){
            if (month.ordinal() == numberMonth-1)
                currentMonth = month;
        }
        return currentMonth;
    }

    private Weekday createWeekday(int numberWeekday){
        Weekday currentWeekday = null;
        for(Weekday weekday : weekdays){
            if (weekday.ordinal() == numberWeekday-1)
                currentWeekday = weekday;
        }
        return currentWeekday;
    }
}
