public class Test {
  public static void main(String[] args) {
    int a = 100;  int b = ++a;
    int c = b++;  int d = ++c;
    System.out.println((a < b) ? (b < c) : (c < d) ? b : c);
  }
}
