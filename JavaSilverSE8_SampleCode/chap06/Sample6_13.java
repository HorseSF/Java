class Sample6_13 {
  public static void main(String[] args) {
    double d = 10.5;
    //int i = d;
    int i = (int)d;
    System.out.println("iの値：" + i);
    //foo(i);
    foo((short)i);
  }
  static void foo(short a){
    System.out.println("aの値：" + a);	
  }
}
