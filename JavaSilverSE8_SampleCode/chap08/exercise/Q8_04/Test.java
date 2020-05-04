public class Test {
  public static void main(String[] args) {
    System.out.println("1 ");
    x();
  }
  static void x() {
    y();
  }
  static void y() {
    if(Math.random() > 0.1) { throw new RuntimeException(); }
    System.out.println("2 ");
  }
}
