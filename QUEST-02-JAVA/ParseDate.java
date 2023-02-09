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
        String[] parts = stringDate.split(" ");
        int h = Integer.parseInt(parts[0]);
        if (!stringDate.contains("matin")) {
            h += 12;
        }
        int m = Integer.parseInt(parts[4]);
        int s = Integer.parseInt(parts[7]);
        return LocalTime.of(h, m, s);
    }
}