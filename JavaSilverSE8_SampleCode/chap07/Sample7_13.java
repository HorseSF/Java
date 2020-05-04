import java.util.function.Function;

class MyFunc implements Function<String, String> {
  public String apply(String str) {
    return "Hello " + str;
  }
}
public class Sample7_13 {
  public static void main(String[] args) {
    MyFunc obj = new MyFunc();
    String str = obj.apply("tanaka");
    System.out.println(str);
  }
}