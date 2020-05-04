class Foo { } 
class Sample7_1 {
  public static void main(String[] args) {
    int[] ary = {1, 2, 3};
    Class obj1 = ary.getClass();
    System.out.println(obj1.getName());
    Foo foo = new Foo();
    Class obj2 = foo.getClass();
    System.out.println(obj2.getName());
  }
}
