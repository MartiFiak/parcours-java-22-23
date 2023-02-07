import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        LocalDateTime dateTime = LocalDateTime.parse(stringDate, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS"));
        return dateTime;
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        DateTimeFormatter localDate = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.forLanguageTag("fr") );
        return LocalDate.parse(stringDate, localDate);
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        LocalTime localTime = LocalTime.parse(stringDate, DateTimeFormatter.ofPattern("HH 'heures du soir,' mm 'minutes et' ss 'secondes'", Locale.forLanguageTag("fr")));
        return localTime;
    }
}