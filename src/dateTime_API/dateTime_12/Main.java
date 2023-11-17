package dateTime_API.dateTime_12;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 12.	*Определить, сколько сейчас времени в Японии. Использовать специальный класс (не считать вручную).
 */
public class Main {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.of("Japan");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zone);
        System.out.println(zonedDateTime);
    }
}
