class Parent { }
class Child extends Parent { }
public class Test {
  public void check(Parent p) {
    if (p instanceof Child)  
      System.out.println("aaa");
    else if (p instanceof Parent)
      System.out.println("bbb");
  }
  public static void main(String[] args) {
    Parent p = new Child();
    new Test().check(p);
  }
}
