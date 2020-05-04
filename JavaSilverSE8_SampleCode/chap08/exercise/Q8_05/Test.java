public class Test {
  public static void main(String[] args) {
    x();
    System.out.print("1 ");
  }
  static void x() {
    y();
    System.out.print("2 ");
  }
  static void y() {
    throw new Exception();
  }
}
