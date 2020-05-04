public class Test {
  int a, b;
  Test(int a, int b) { this.a = a; this.b = b; }
  void bar(Test obj) { obj.a = 200; }
  void setA(int a) { this.a = a; }
  int getA() { return a; }
  public static void main(String[] args) {
    Test obj = new Test(10, 20);
    int a = 300;
    obj.setA(a);
    obj.bar(obj);
    System.out.print(a + " ");
    System.out.println(obj.getA());
  }
}
