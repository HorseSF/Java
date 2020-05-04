import java.time.*;

public class Sample7_10 {
  public static void main(String[] args) {
    LocalDate dateNow = LocalDate.now();
    LocalTime timeNow = LocalTime.now();
    LocalDateTime dtNow = LocalDateTime.now();
    
    LocalDate dateOf = LocalDate.of(2015, 10, 1);
    LocalTime timeOf = LocalTime.of(21, 3, 20);
    LocalDateTime dtOf =
          LocalDateTime.of(2015, 10, 1, 21, 3, 20);
    
    LocalDate dateP = LocalDate.parse("2015-10-01");
    LocalTime timeP = LocalTime.parse("21:03:20");
    LocalDateTime dtP = 
          LocalDateTime.parse("2015-10-01T21:03:20");
    
    System.out.println("LocalDate.now       : " + dateNow);
    System.out.println("LocalTime.now       : " + timeNow); 
    System.out.println("LocalDateTime.now   : " + dtNow);

    System.out.println("LocalDate.of        : " + dateOf);
    System.out.println("LocalTime.of        : " + timeOf); 
    System.out.println("LocalDateTime.of    : " + dtOf);
    
    System.out.println("LocalDate.parse     : " + dateP);
    System.out.println("LocalTime.parse     : " + timeP);
    System.out.println("LocalDateTime.parse : " + dtP);

  }
}