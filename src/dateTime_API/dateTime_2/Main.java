package dateTime_API.dateTime_2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 2.	Создать объект даты, объект времени из строки. Не использовать методы класса String.
 */
public class Main {
    public static void main(String[] args) {
        String date = "2023/10/26";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.parse(date, dateFormatter);
        System.out.println(localDate);

        String time = "13:13:13";
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.parse(time, timeFormatter);
        System.out.println(localTime);
    }
}
