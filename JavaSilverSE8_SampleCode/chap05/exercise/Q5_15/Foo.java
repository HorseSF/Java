class Foo {
  static int x = 1;
  int y = 1;
  public static void main(String[] args) {
    Foo f1 = new Foo();
    Foo f2 = new Foo();
    f1.x = 5;
    f1.y = 6;
    f2.x = 7;
    f2.y = 8;
    System.out.println("ans:" + f1.x +  f1.y + f2.x + f2.y);
  }
}
