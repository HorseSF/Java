import java.util.function.Function;

public class Sample7_14 {
  public static void main(String[] args) {
    String str = new Function<String, String>() {
      public String apply(String str) {
        return "Hello " + str;
      }
    }.apply("tanaka");
    System.out.println(str);
  }
}