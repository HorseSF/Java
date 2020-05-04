class A {
  A(String s, int i) {}
}
class B extends A {
  double d ;
  B(String s, int i, double d) {
    super(s, i);
    this.d = d;
  }
}
public class Test {
  public static void main(String[] args) {
    new B("tmp", 5, 10.0);
  }
}
