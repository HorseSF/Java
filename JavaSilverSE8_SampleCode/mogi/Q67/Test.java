import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Test {
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2015, 1, 30);
    System.out.println(date.format(DateTimeFormatter.ISO_DATE));
  }
}