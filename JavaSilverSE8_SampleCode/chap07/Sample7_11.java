import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Sample7_11 {
  public static void main(String[] args) {
    LocalDateTime dateTime1 = LocalDateTime.now();
    DateTimeFormatter fmt1 = DateTimeFormatter.ISO_DATE;
    System.out.println("now()       : " + dateTime1);
    System.out.println("ISO_DATE    : " + fmt1.format(dateTime1));
    
    DateTimeFormatter fmt2 = 
             DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    String target = "2015/10/01 21:03:20";
    LocalDateTime dateTime2 = LocalDateTime.parse(target, fmt2);
    System.out.println("ofPattern() : " + dateTime2);
  }
}