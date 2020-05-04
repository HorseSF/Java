interface A { void method(); }
class B implements A { 
  public void method() { System.out.println("B"); }
}
class C implements A { 
  public void method() { System.out.println("C"); }
}
public class Test {
  public static void main(String[] args) {
    A obj1 = new B();
    A obj2 = new C();
    A obj3 = (A)obj2;  //‡@
    obj1 = obj3;       //‡A
    obj1.method();
  }
}

