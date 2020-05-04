public class Test {
  public static void main(String[] args) {
    String s1 = "100";
    String s2 = "TRUE";
    int val1 = Integer.parseInt(s1);
    boolean val2 = Boolean.parseBoolean(s2);
    int val3 = Integer.valueOf(s1);
    boolean val4 = Boolean.valueOf(s2);
    System.out.println(val1 + " " + val2 + " " + val3 + " " + val4);
  }
}
