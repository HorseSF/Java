public class Test {
  public static void main(String[] args) {
    int x = 5;
    while(foo(x)) {
      System.out.print(x + " "); //‡@
      //‡A
    }
  }
  static boolean foo(int x) {
    return --x > 0 ? true : false; //‡B
  }
}
