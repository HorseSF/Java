public class Test {
  final int a;
  Test(int b) { a = b; }
  void method(int c) { a = c; }
  public static void main(String[] args) {
    Test t = new Test(10);
    t.method(20);
    System.out.println(t.a);
  }
}
