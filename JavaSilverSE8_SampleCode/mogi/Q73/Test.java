import java.io.IOException;
public class Test {
  public static void main(String[] args) { //‡@
    Test obj = new Test(); 
    obj.method();  //‡A
  }
  void method() throws IOException { } //‡B
}
