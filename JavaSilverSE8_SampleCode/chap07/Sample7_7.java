class Foo {
  String name;
  Foo(String name) { this.name = name; }
} 
class Sample7_7 {
  public static void main(String[] args) {
    Foo[] ary = { new Foo("tanaka"),
                  new Foo("suzuki"),
                  new Foo("yamada") };
    
    System.out.println(ary);
    System.out.println(ary[1]);
    System.out.println(ary[1].name);
  }
}
