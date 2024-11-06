package pushpak60DateTimeApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneDateTime1 {
    public static void main(String[] args) {
        ZonedDateTime now  =ZonedDateTime.now();
        System.out.println(now);
        Set<String> avilablezone = ZoneId.getAvailableZoneIds();
        avilablezone.forEach(System.out::println);

    }

}
