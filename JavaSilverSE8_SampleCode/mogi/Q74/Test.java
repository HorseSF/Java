class Foo {
  String str;
  void x(String str) { this.str = str; }
  void y(String str) {
    String s = str;
    try {
      int a = Integer.parseInt(s);
    }catch(NumberFormatException e) {
      System.out.print("ex ");
    }
    System.out.print(s + " ");
  }
}
public class Test {
  public static void main(String[] args) {
    Foo obj = new Foo();
    obj.x("7777");
    obj.y("9999");
    System.out.println(obj.str);
  }
}
