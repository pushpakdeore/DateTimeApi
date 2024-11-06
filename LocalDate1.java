package pushpak60DateTimeApi;


import java.time.LocalDate;

public class LocalDate1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate custom = LocalDate.of(2014,8,13);
        System.out.println(custom);
        int dayofMonth = today.getDayOfMonth();
        int month =today.getMonthValue();
        int year =today.getYear();
        System.out.println(dayofMonth);
        System.out.println(month);
        System.out.println(year);

    }

}
