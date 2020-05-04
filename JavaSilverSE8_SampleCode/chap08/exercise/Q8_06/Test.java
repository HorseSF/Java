public class Test {
  public static void main(String[] args) throws Exception{
    x();
    System.out.print("1 ");
  }
  static void x() throws Exception {
    if(Math.random() > 0.1) { throw new Exception(); }
    System.out.print("2 ");
  }
}
