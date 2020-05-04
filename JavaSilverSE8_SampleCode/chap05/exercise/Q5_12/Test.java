class Foo1 {
  int x;
  void setX(int x) {this.x = x;}
  int getX() {return x;}
}

class Foo2 {
  Foo1 f;
  void setFoo1(Foo1 f) {this.f = f;}
  Foo1 getFoo1() {return f;}
}

class Test {
  public static void main(String[] args) {
    Foo1 f1 = new Foo1();
    Foo2 f2 = new Foo2();
    int a = 10;
    f1.setX(a);
    f2.setFoo1(f1);
    [     ‡@     ]
    System.out.println(f2.getFoo1().getX());
  }
}
