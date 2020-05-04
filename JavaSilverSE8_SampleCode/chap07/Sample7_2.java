class Foo { }

class Sample7_2 {
  public static void main(String[] args) {
    Foo f1 = new Foo();   Foo f2 = new Foo();
    System.out.println("f1.equals(f2)   : " + (f1.equals(f2)));

    Foo f3 = new Foo();   Foo f4 = f3;
    System.out.println("f3.equals(f4)   : " + (f3.equals(f4)));
  }
}
