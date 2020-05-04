public class Test {
  void a(Integer val) { System.out.println("Integer"); }
  void a(int val)     { System.out.println("int"); }
  void a(double val)  { System.out.println("double"); }
  void a(float val)   { System.out.println("float"); }
  public static void main(String[] args) {
    Test obj = new Test();
    obj.a(10);
    obj.a(3.0);
  }
}
