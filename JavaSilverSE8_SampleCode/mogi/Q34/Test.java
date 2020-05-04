public class Test {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "hello";
    System.out.println(s1.toUpperCase() == s2.toUpperCase()); //‡@
    System.out.println(
                (s1.toUpperCase()).equals(s2.toUpperCase())); //‡A
    System.out.println(s1.equalsIgnoreCase(s2));  //‡B
    String s3 = s1;
    System.out.println(s1 == s3);    //‡C
    System.out.println(s1.toString() == s2.toString());  //‡D
  }
}
