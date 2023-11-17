package dateTime_API.dateTime_6;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 6.	Дано две даты.
 * 1) Найти период между ними в виде количества лет, месяцев, дней.
 * 2) Найти общее количество лет, месяцев, дней (например, 1265 дней).
 */
public class Main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2020, Month.MARCH, 31);
        LocalDate date2 = LocalDate.now();

        Period period = Period.between(date1, date2);

        System.out.println(period.getYears() + " years");
        System.out.println(period.getMonths() + " months");
        System.out.println(period.getDays() + " days");

        long years = ChronoUnit.YEARS.between(date1, date2);
        long months = ChronoUnit.MONTHS.between(date1, date2);
        long days = ChronoUnit.DAYS.between(date1, date2);

        System.out.println(years + " total years / " + months + " total months / " + days + " total days");
    }
}
