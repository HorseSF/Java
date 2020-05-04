import java.util.function.Function;

public class Sample7_15 {
  public static void main(String[] args) {
    Function<String, String> obj = (String str) -> {
      return "Hello " + str;
    };
    String str = obj.apply("tanaka");
    System.out.println(str);
  }
}