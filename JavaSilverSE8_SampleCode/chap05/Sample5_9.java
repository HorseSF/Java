class Foo {
  static {
    System.out.println("Fooクラス：static イニシャライザ");
  }
  Foo() { 
    System.out.println("Fooクラス：コンストラクタ");
  }
}

public class Sample5_9 {
  static {
    System.out.println("Sample5_9クラス：static イニシャライザ");
  }
  public static void main(String[] args) {
    System.out.println("Sample5_9クラス：main()メソッド");
    Foo f = new Foo();
  }
}
