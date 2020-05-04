class P {
  public void strToNum(String s) {
    System.out.println("P : " + Integer.parseInt(s));
  }
}
class C extends P {
  public void strToNum(String s) throws RuntimeException {
    System.out.println("C : " + Integer.parseInt(s));
  }
}
public class Test {
  public static void main(String[] args) {
    C c = new C();
    c.strToNum("a");
  }
}
