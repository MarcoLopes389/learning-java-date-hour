import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        var data = LocalDate.now(ZoneId.of("America/Sao_Paulo"));
        LocalDateTime.now();
        Instant.now();
        System.out.println(ZonedDateTime.now());

        var dataAmanha = LocalDate.now().plusDays(1).plusMonths(2);
        var daysDiff = dataAmanha.compareTo(data);
        var birthDate = LocalDate.of(2002, 11, 29);
        var age = ChronoUnit.YEARS.between(birthDate, LocalDate.now());
        var monthsDiff = ChronoUnit.MONTHS.between(data, dataAmanha);
        
        System.out.println(daysDiff);
        System.out.println(monthsDiff);
        System.out.println(dataAmanha);
        System.out.println(age);
        var formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(formatter.format(birthDate));
    }
}