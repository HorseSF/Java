public class Test {
  public static void main(String[] args) {
    String str1 = "Java";
    String str2 = new String("Java");
    if(str1 == str2) System.out.println("==");
    if(str1.equals(str2)) System.out.println("equals");
  }
}
