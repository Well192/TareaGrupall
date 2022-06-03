
import java.time.*;
import java.time.chrono.ChronoLocalDate;

public class Date {

    public int year;
    public int month;
    public int dayOfMonth;
    enum Weekday {

        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY

    }

    public Weekday dayOfWeek() {

        LocalDate x = LocalDate.of(year, month, dayOfMonth);

        switch ( String.valueOf(x.getDayOfWeek()) ){

            case "SUNDAY" : return Weekday.SUNDAY;

            case "MONDAY" : return Weekday.MONDAY;

            case "TUESDAY" : return Weekday.TUESDAY;

            case "WEDNESDAY" : return Weekday.WEDNESDAY;

            case "THURSDAY": return Weekday.THURSDAY;

            case "FRIDAY" : return Weekday.FRIDAY;

            case "SATURDAY" : return Weekday.SATURDAY;

            default: return null;

        }

    };

    public Date(int year, int month, int dayOfMonth) {

        this.year = year;

        this.month = month;

        this.dayOfMonth = dayOfMonth;

    }

}