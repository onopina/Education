package dateTime_API.dateTime_5;

import java.time.LocalDate;
import java.time.Month;

/**
 * 5.	Создать любую дату. Определить, является ли год в текущей дате високосный. Получить день неделе.
 */
public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.MARCH, 31);
        System.out.println(date.isLeapYear());
        System.out.println(date.getDayOfWeek());
    }
}
