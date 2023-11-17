package dateTime_API.dateTime_7;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * 7.	Дано два времени.
 * 1)	Найти длительность между двумя датами в виде количества часов, минут, секунд, миллисекунд.
 * 2)	Найти длительность в виде общего количества часов, минут, секунд, миллисекунд (например, 140 минут).
 */
public class Main {
    public static void main(String[] args) {
        LocalTime localTime1 = LocalTime.of(10, 49, 10, 100);
        LocalTime localTime2 = LocalTime.now();

        Duration duration = Duration.between(localTime1, localTime2);

        System.out.println(duration.toHoursPart() + " hours");
        System.out.println(duration.toMinutesPart() + " minutes");
        System.out.println(duration.toSecondsPart() + " seconds");
        System.out.println(duration.toMillisPart() + " millis");

        long hours = ChronoUnit.HOURS.between(localTime1, localTime2);
        long minutes = ChronoUnit.MINUTES.between(localTime1, localTime2);
        long seconds = ChronoUnit.SECONDS.between(localTime1, localTime2);
        long millis = ChronoUnit.MILLIS.between(localTime1, localTime2);

        System.out.println(hours + " total hours / " + minutes + " total minutes / " +
                seconds + " total seconds / " + millis + " total millis");
    }
}
