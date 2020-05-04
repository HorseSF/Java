interface MyInter1 {
  void methodA();
}
class Super {
  void methodB(){ }
}
class MyClass extends Super implements MyInter1 {
  public void methodA(){ }
}
