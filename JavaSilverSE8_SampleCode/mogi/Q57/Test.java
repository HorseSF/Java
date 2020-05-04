interface A { void foo(); }
abstract class B implements A {
  void bar(String[] s) { }
}
class C extends B {
  protected void bar(String[] s) { }
}

