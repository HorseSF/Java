public class Test {
  void methodA() throws Exception { }   //‡@
  void methodB() throws RuntimeException { }  //‡A
  public static void main(String[] args) {
    Test obj = new Test();
    obj.methodA();   //‡B
    obj.methodB();   //‡C
  }
}
