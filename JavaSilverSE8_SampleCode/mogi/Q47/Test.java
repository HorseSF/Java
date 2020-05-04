public class Test {
  int a;
  static int b;
  Test() {
    int i = 0;
    while(i < 5) { i++; a++; b++; }
  }
  public static void main(String[] args) {
    Test o1 = new Test();
    Test o2 = new Test();
    System.out.println(o1.a + " " + o1.b);
    System.out.println(o2.a + " " + o2.b);
  }
}
