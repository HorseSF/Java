abstract class Foo {
  int x; int y;
  public abstract void print();
  public void method(int x, int y){ this.x = x; this.y = y; }
}
class MyClass extends Foo {
  public void print() {
    System.out.println("x : " + x + " y : " + y);
  }
}
class Sample6_14 {
  public static void main(String[] args) {
    //スーパークラスの変数にサブクラスのオブジェクトを代入
    Foo f = new MyClass(); 
    f.method(10, 20);  // スーパークラスのメソッド呼び出しOK
    f.print();         // サブクラスのメソッド呼び出しOK
  }
}
