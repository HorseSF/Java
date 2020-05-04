public class Test {
  int x;
  int y;
  void methodA(int x, int y) {
    x = x;
    y = y;
  }
  void methodB(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public static void main(String[] args) {
    Test test = new Test();
    test.methodA(10, 20);
    System.out.println("methodA: " + test.x + " " + test.y);
    test.methodB(50, 60);
    System.out.println("methodB: " + test.x + " " + test.y);
  }
}
