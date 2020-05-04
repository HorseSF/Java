class Test {
  int val;
  static void x(int val) {
    val = 9;
    System.out.print(val + " ");
  }
  public static void main(String[] args) { 
    Test test = new Test();
    test.val = 8;
    int val = 10;
    System.out.print(val + " ");
    x(val);
    System.out.print(val + " ");
    System.out.print(test.val + " ");
  }
}
