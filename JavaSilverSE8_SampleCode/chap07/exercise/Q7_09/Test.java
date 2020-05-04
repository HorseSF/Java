import java.time.LocalDateTime;
public class Test {
  public static void main(String[] args) {
    LocalDateTime dateTime = 
          LocalDateTime.parse("2015-10-01T21:03:20");
    dateTime.plusDays(3);
    dateTime.minusDays(2);
    System.out.println(dateTime);
  }
}