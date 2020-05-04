import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Test {
  public static void main(String[] args) {
    LocalDateTime ldt = LocalDateTime.now();
    System.out.println(ldt.format(DateTimeFormatter.ISO_DATE_TIME));
  }
}