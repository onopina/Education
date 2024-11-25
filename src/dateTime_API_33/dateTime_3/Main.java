package dateTime_API_33.dateTime_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 3.	Отформатировать дату по формату: dd:MM:yyyy. Не использовать методы класса String.
 */
public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd:MM:yyyy");
        String dateStr = currentDate.format(formatter);
        System.out.println(dateStr);
    }
}
