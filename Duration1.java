package pushpak60DateTimeApi;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Duration1 {
    public static void main(String[] args) {
        Instant Start =Instant.now();
        Instant end =Instant.now();
        Duration d1 =Duration.between(Start,end);
        Duration d2 = Duration.of(1, ChronoUnit.MILLIS);
        System.out.println(d1);
        System.out.println(d2);
    }

}
