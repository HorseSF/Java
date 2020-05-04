import java.io.IOException;
public class Test {
  public static void main(String[] args) { //‡@
    method(); //‡A
  }
  static void method() {  //‡B
    throw new IOException();
  }
}
