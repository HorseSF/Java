class Test {
  static void methodA() {
    methodB();
    Test.methodB();
    methodC();
    Test.methodD();
  }
  static void methodB() { }
  void methodC() {
    methodB();
    Test.methodB();
    methodD();
    Test.methodD();
  }
  void methodD() { }
}
