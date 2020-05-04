class X {}
class Y extends X {}
class Z extends X {}
public class Test {
  public static void main(String[] args) {
    X obj1 = new X();
    Y obj2 = new Y();
    X obj3 = new Z();
    X obj4 = (X)obj2;
    X obj5 = (Y)obj3;
  }
}
