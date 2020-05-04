class Foo {
  void method(Object obj) { System.out.println("Object"); }
  void method(Number obj) { System.out.println("Number"); }
  void method(Integer obj) { System.out.println("Integer"); }
  void method(char[] obj) { System.out.println("char[]"); }
}
public class Test {
  public static void main(String[] args) {
    Foo foo = new Foo();
    foo.method("Hello");
  }
}
