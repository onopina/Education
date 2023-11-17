package dateTime_API.dateTime_13;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 * 13.	*Дано расписание поездов.
 * Каждый поезд отправляется в определенное время (каждые 40-50 минут, определить рандомно)
 * и проводит в пути определенное время (определить рандомно: от 15 до 40 минут).
 * Расчет расписания начинается с 00:00.
 * Составить расписание поездов в удобном виде.
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
            schedule.add(new Train(dateTime, Duration.ofMinutes(random.nextInt(15, 41))));
            dateTime = dateTime.plusMinutes(random.nextInt(40, 51));
        }

        return schedule;
    }
}
