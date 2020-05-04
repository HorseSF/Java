public class Test {
  private String msg;
  public Test() { this("Good morning"); }
  public Test(String msg) { msg = msg; }
  public String toString(){ return ("msg : " + msg); }

  public static void main(String[] args) {
    System.out.println(new Test());
  }
}
