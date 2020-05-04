class Foo {
  public void method(int a) {
    System.out.println("method(int a)");
  }
  public void method(long a) {
    System.out.println("method(long val)");
  }
  public void method(Integer a) {
    System.out.println("method(Integer val)");
  }
}
class Sample6_18 {
  public static void main(String[] args) {
    Foo obj = new Foo();
    obj.method(100);
  }
}
