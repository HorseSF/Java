class Foo {
  String s; int i;
  public Foo() {
    this("no_deta");
  }
  public Foo(String s) { 
    this(s, 1);
  }
  public Foo(String s, int i) { 
    this.s = s; this.i = i;
    System.out.println("String : " + this.s);
    System.out.println("int    : " + this.i);
  }
}
class Sample6_4 {
  public static void main(String[] args) {
    System.out.println("Foo()‚ÌŒÄ‚Ño‚µ-----------------");
    Foo f1 = new Foo();
    System.out.println("Foo(\"Hey\")‚ÌŒÄ‚Ño‚µ------------");
    Foo f2 = new Foo("Hey");
    System.out.println("Foo(\"Bye\", 200)‚ÌŒÄ‚Ño‚µ-------");
    Foo f3 = new Foo("Bye", 200);
  }
}
