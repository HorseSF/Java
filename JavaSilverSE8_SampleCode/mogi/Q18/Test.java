class Foo {
  int val;
  Foo(int val) { this.val = val; }
}
public class Test {
  public static void main(String[] args) {
    Foo[] ary = { new Foo(100),
                  new Foo(200),
                  new Foo(300) };
    System.out.println(ary);
    System.out.println(ary[1]);
    System.out.println(ary[1].val);
  }
}