package dateTime_API_33.dateTime_4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 4.	Получить объект даты из строки 20:03:2021. Не использовать методы класса string.
 */
public class Main {
    public static void main(String[] args) {
        String date = "20:03:2021";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd:MM:yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);
    }
}
