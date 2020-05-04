class A {
  A() {}
  A(String s, int i) {}
}
class B extends A {
  B(double d) {}
  B(String s, int i, double d) {
    super(s, i);
    this(d);
  }
}
public class Test {
  public static void main(String[] args) {
    new B();
    new B(10.0);
    new B("tmp", 5, 10.0);
  }
}
