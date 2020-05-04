class Sample6_17 {
  public static void main(String[] args) {
    double d1 = 10;   //OK    
    //Double d2 = 10; //NG
    Short num1 = 10;        method(num1);
    int num2 = 100;         //method(num2); //NG
  }
  static void method(short obj) { System.out.println("short"); }
  static void method(Short obj) { System.out.println("Short"); }
  static void method(Long obj)  { System.out.println("Long"); }
}