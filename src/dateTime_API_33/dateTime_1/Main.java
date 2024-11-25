package dateTime_API_33.dateTime_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 1.	Создать объект текущей даты, текущего времени, текущих даты и времени двумя способами.
 */
public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        LocalDateTime currentDateTime1 = LocalDateTime.of(currentDate, currentTime);
        System.out.println(currentDateTime1);
    }
}
