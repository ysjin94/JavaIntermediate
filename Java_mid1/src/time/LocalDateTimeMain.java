package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 0, 0);
        System.out.println("now = " + now);
        System.out.println("ofDt = " + ofDt);

        //
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localTime = " + localTime);

        LocalDate localDate = ofDt.toLocalDate();
        System.out.println("localDate = " + localDate);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        //
        LocalDateTime ofDtPlus = ofDt.plusDays(10);
        System.out.println("ofDtPlus = " + ofDtPlus);

        System.out.println(now.isBefore(ofDtPlus));
        System.out.println(now.isEqual(ofDtPlus));
        System.out.println(now.isAfter(ofDtPlus));
    }
}
