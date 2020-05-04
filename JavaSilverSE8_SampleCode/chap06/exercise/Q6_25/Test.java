class Test {
  public static void main(String[] args) {
    Test obj1 = new Foo();
    obj1.method();
    (Foo)obj1.method();
    ((Foo)obj1).method();
    Foo obj2 = new Foo();
    obj2.method();
    (Foo)obj2.method();
    ((Foo)obj2).method();
  }
}
class Foo extends Test implements MyInter {
  public void method() {
    System.out.println("Hello");
  }
}
interface MyInter {
  void method();
}
