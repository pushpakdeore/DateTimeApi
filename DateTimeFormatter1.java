package pushpak60DateTimeApi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter1 {
    public static void main(String[] args) {
        String date ="25/04/1998";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parse = LocalDate.parse(date, dateTimeFormatter);
        System.out.println(parse);

    }

}
