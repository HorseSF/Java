class Super {    // スーパークラス
  public void print(String s) {
    System.out.println("Super print : " + s);
  }
  public void method(){ } 
}
class Sub extends Super {  // サブクラス
  public void print(String s) {
    s = "渡された文字列は " + s + " です";
    System.out.println("Sub print   : " + s);
  }
  //void method(){ } //コンパイルエラー 
}
class Sample6_2 {
  public static void main(String[] args) {
    Super s1 = new Super();
    s1.print("Java");    // 2行目が呼び出される
    Sub s2 = new Sub();
    s2.print("Java");    // 8行目が呼び出される
  }
}
