package dateTime_API_33.dateTime_14;

import java.time.Duration;
import java.time.LocalDateTime;

public class Train{
    private LocalDateTime localTime;
    private Duration duration;

    public Train(LocalDateTime localTime, Duration duration) {
        this.localTime = localTime;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Train{" +
                "localTime=" + localTime +
                ", duration=" + duration +
                '}';
    }
}
