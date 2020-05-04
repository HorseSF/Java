class A {
  A(String message) {
    System.out.println(message + " from A.");
  }
}
class B extends A{
  B() {
    System.out.println("Hello from B.");
  }
}
public class Test {
  public static void main(String[] args) {
    B b = new B();
  }
}
