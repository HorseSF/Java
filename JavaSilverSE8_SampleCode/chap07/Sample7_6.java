class Foo { } 
class Bar {
  public String toString() {
    return "This is an object made from Bar.";
  }
}
class Sample7_6 {
  public static void main(String[] args) {
    String obj1 = "tanaka";
    StringBuilder obj2 = new StringBuilder("tanaka");
    Foo obj3 = new Foo();
    Bar obj4 = new Bar();
    System.out.println(obj1);
    System.out.println(obj2);
    System.out.println(obj3);
    System.out.println(obj4);
  }
}
