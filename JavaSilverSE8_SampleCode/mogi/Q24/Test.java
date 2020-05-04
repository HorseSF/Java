public class Test {
  public static void main(String[] args) {
    int x = 10, y = 10;
    if(x++ < ++y) System.out.println("A");
    else System.out.println("B");
  }
}
