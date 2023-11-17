package dateTime_API.dateTime_8;

import java.time.LocalDate;
import java.time.Month;

/**
 * 8.	Дано две даты. Определить, какая дата идет раньше, а какая позже.
 */
public class Main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2022, Month.APRIL, 18);
        LocalDate date2 = LocalDate.of(2020, Month.SEPTEMBER, 10);

        if (date1.isAfter(date2)) {
            System.out.println(date1 + " is later than " + date2);
        } else {
            System.out.println(date2 + " is later than " + date1);
        }
    }
}
