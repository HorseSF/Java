interface A { }
class B { }
class C extends B { }
class D { }
class Sample6_15 {
  public static void main(String[] args) {
    C obj = new C();
    System.out.println(obj instanceof A);
    System.out.println(obj instanceof B);
    System.out.println(obj instanceof C);
    //System.out.println(obj instanceof D);
  }
}
