public class Test {
  void x(int num) {
    num += 30;
  }
  public static void main(String[] args) {
    int num = 10;
    Test t = new Test();
    t.x(num);
    System.out.println(num);
  }
}
