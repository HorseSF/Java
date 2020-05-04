public class Test {
  public static void main(String[] args) {
    int i = 5;
    int j = 10;
    int k = 15;
    if ((i++ < j) | (k-- > j))
      System.out.println("values of i : " + i + 
                         " values of k: " + k);
  }
}
