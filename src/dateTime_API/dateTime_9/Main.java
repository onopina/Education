package dateTime_API.dateTime_9;

import java.time.LocalDate;

/**
 * 9.	Дано два года – начальный и конечный. Посчитать количество високосных лет между ними.
 */
public class Main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(1988, 1, 1);
        LocalDate date2 = LocalDate.now();

        int numberOfLeapYears = 0;

        while (date2.getYear() != date1.getYear()){
            if (date1.isLeapYear()) {
                numberOfLeapYears++;
            }
            date1 = date1.plusYears(1);
        }

        System.out.println("The number of leap years is " + numberOfLeapYears);
    }
}
