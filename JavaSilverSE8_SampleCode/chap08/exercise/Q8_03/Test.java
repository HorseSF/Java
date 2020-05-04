public class Test {
  public static void main(String[] args) {
    try {
      x();
      System.out.print("1 ");
    }catch(RuntimeException ex){
      System.out.print("2");
    }
  }
  static void x() throws RuntimeException {
    if(Math.random() > 0.1) { throw new RuntimeException(); }
    System.out.print("3 ");
  }
}
