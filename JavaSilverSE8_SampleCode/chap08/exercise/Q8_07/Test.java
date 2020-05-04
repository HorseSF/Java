public class Test {
  public static void main(String[] args) {
    String s  = "123.45";
    change(s);
  }
  public static void change(String s) {
    try {
      int i = Integer.parseInt(s);
      System.out.println(i);
    } catch (Exception e) {
      System.out.println("caught exception : " + i);
    } finally {
      System.out.println();
    }
  }
}
