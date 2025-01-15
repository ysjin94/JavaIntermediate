package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate ofDate = LocalDate.of(2020, 1, 1);
        System.out.println(ofDate);

        //Calculate
        ofDate = ofDate.plusDays(1);
        System.out.println(ofDate);

    }
}
