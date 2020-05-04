import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Test {
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2015, 4, 32);
    date = date.minusDays(2);
    System.out.println(date.format(DateTimeFormatter.ISO_DATE));
  }
}