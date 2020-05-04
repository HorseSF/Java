class Foo {
  int id; String name;
  Foo(int id) {
    this();    //‡@
  }
  Foo(int id, String name) {
    this(id);  //‡A
  }
}
public class Test {
  public static void main(String[] args) {
    new Foo(10);
    new Foo(10, "nao");
  }
}
