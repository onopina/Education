package dateTime_API.dateTime_14;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 * 14.	*На основе 13 задачи. Дано время отправки и длительность поездки в минутах.
 * После составления расписания определить: можно ли вписать данное время в расписание,
 * чтобы не было накладки (один рейс не может «накладываться» на другой,
 * каждый поезд следует только после завершения поездки предыдущего).
 */
public class Main {
    public static void main(String[] args) {
        generateSchedule().forEach(System.out::println);
    }

    public static Set<Train> generateSchedule(){
        Set<Train> schedule = new LinkedHashSet<>();
        LocalDateTime dateTime = LocalDateTime.of(2023, 1, 1,0, 0);
        LocalDateTime finish = LocalDateTime.of(2023, 1, 2, 0, 0);

        Random random = new Random();

        while (dateTime.isBefore(finish)) {
            int randomDuration = random.nextInt(15, 41);
            schedule.add(new Train(dateTime, Duration.ofMinutes(randomDuration)));
            dateTime = dateTime.plusMinutes(random.nextInt(randomDuration, 51));
        }

        return schedule;
    }
}
