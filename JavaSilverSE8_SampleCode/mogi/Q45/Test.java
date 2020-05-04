public class Test {
  int num;
  static void foo(int x) {
    num++;   //‡@
    System.out.println("x   : " + x );   //‡A
    System.out.println("num : " + num ); //‡B
  }
}