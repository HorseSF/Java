class Super {
  int num;
  public void methodA() { num += 100; }
  public void print() {System.out.println("num値 :" + num); }
}
class Sub extends Super {
  public void methodA() { num += 500; }
  public void methodB(int num) {
    methodA();        // 7行目が呼び出される
    print(); // スーパークラスのメソッド呼び出し
    super.methodA();  // 3行目が呼び出される
    print(); // スーパークラスのメソッド呼び出し
  }
}
class Sample6_5 {
  public static void main(String[] args) {
    Sub s = new Sub();
    s.methodB(0);
  }
}
