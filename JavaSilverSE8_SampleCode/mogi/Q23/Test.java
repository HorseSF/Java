public class Test {
  public static void main(String[] args) {
    int x, y, z;
    if(x == 0) {
      x = 10;  y = x++;  z = x + y;
      System.out.println(x + " " + y + " " + z);
    }
  }
}
