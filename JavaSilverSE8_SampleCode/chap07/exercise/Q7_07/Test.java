interface Z{ }
class Y extends X { public String toString() { return "Y"; } }
class X implements Z { public String toString() { return "X"; } }
public class Test {
  public static void main(String[] args) {
    Y y = new Y();
    X x = y;
    Z z = x;
    System.out.print(x + " ");
    System.out.print((Y)x + " ");
    System.out.print(z + " ");
  }
}
