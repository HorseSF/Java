public class Test {
  public static void main(String[] args) {
    Test ojb1 = new Test();
    Test ojb2 = new Test();
    System.out.print(ojb1 == ojb2);
    ojb2 = operate(ojb1, ojb2);
    System.out.print(" " + (ojb1 == ojb2));
  }

  static Test operate(Test ojb1, Test ojb2) {
    Test ojb3 = ojb1;
    ojb1 = ojb2;
    return ojb3;
  }
}
