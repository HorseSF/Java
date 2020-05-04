public class Test {
  public static void main(String[] args) {
    String s1 = "ABCDE";
    String s2 = s1.substring(2, 4);
    String s3 = "CD";
    System.out.print(s2 == s3);
    System.out.println(" " + s2.equals(s3));
  }
}
