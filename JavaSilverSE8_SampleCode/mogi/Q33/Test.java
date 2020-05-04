public class Test {
  public static void main(String[] args) {
    String s1 = "A";
    String s2 = s1.concat("B");
    String s3 = s2.concat("C");
    String s4 = s3.replace('C', 'D');
    String s5 = s4.concat("E");
    System.out.println(s1 + " " + s5);
  }
}
