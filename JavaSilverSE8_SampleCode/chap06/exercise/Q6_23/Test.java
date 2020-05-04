class X{ }
interface A{ }
class Y extends X implements A{
  void show() { System.out.println("Hello"); }
}
public class Test {
  public static void main(String[] args) { 
    X x1 = new X();
    X x2 = new Y();
    ((Y)x2).show();
    ((A)x1).show();
  }
}
