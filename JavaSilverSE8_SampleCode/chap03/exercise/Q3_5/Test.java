public class Test {
  public static void main(String[] args) {
    boolean b1 = false, b2 = false;
    int i = 12, j = 11;
    j++;
    if ((i = j) && (b1 == b2)) 
      System.out.println("true");
    else 
      System.out.println("false");
  }
}
