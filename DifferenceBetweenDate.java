import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DifferenceBetweenDate {

    public static Duration durationBetweenTime(LocalTime localTime1, LocalTime localTime2) {
        int dur = localTime1.compareTo(localTime2);
        return Duration.ofHours(dur).plusMinutes(dur).plusSeconds(dur);
    }

    public static Period periodBetweenDate(LocalDate date1, LocalDate date2) {
        // your code here
    }

    public static Long numberOfHoursBetweenDateTime(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        // your code here
    }

}