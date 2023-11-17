package dateTime_API.dateTime_11;

import java.time.LocalDate;

/**
 * 11.	Дана определенная дата.
 * Определить, какой день недели будет через: 1) 100 дней, 2) 3 месяца, 3) неделю, 4) через год.
 */
public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, 3, 31);

        System.out.println("The day after 100 days will be is " + date.plusDays(100).getDayOfWeek());
        System.out.println("The day after 3 months will be is " + date.plusMonths(3).getDayOfWeek());
        System.out.println("The day after 1 week will be is " + date.plusWeeks(1).getDayOfWeek());
        System.out.println("The day after 1 year will be is " + date.plusYears(1).getDayOfWeek());
    }
}
