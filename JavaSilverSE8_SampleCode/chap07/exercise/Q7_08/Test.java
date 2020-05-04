class Foo {
  String val;
  Foo(String val) { this.val = val; }
}
public class Test {
  public static void main(String[] args) { 
    Foo obj = new Foo("hello"); 
    String s = "hello";
    StringBuilder sb = new StringBuilder("hello");
    System.out.println(obj + " " + s + " " + sb);
  }
}
