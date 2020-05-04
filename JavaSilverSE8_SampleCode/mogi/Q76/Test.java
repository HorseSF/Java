class MyException extends RuntimeException {}
class A {
  void bar() {
    try {
      throw (1 + Math.random()) * 100 > 0 ? 
           new MyException(): new RuntimeException();
    }catch(MyException ex1) {
      System.out.print("A ");
    }catch(RuntimeException ex2) {
      System.out.print("B ");
    }
  }
}
public class Test {
  public static void main(String[] args) {
    try {
      new A().bar();
    } catch(MyException ex){
      System.out.print("C ");
    }
  }
}
