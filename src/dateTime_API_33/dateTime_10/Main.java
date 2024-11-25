package dateTime_API_33.dateTime_10;

import java.time.LocalDate;
import java.time.Period;

/**
 * 10.	Определить возраст языка Java в годах, месяцах и минутах (например, 20 лет 3 месяца 5 дней).
 */
public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1995, 5, 23);
        LocalDate today = LocalDate.now();

        Period period = Period.between(date, today);

        System.out.println("The age of Java is " + period.getYears() + " years, " +
                period.getMonths() + " months, " + period.getDays() + " days");
    }
}
