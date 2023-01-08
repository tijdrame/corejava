import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateformatDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("date="+date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
