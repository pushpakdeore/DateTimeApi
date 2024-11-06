package pushpak60DateTimeApi;

import java.time.LocalTime;

public class LocalTIme1 {
    public static void main(String[] args) {
        LocalTime now =LocalTime.now();
        System.out.println(now);
        LocalTime customdate =LocalTime.of(2,50);
        System.out.println(customdate);
        LocalTime parsedTime = LocalTime.parse("15:30:45");
        System.out.println(parsedTime.getMinute());
        System.out.println(parsedTime);
    }
}
