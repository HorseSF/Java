public class Test {
  static void method() {
    int ary [] = new int [5];
    for (int i = 0 ; i <= 5 ; i++) ary[i] = i;
  }
  public static void main(String[] args) {
    try {
      method();
      System.out.print("try ");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.print("catch1 ");
    } catch (Exception e) {
      System.out.print("catch2 ");
    } finally {
      System.out.print("finally ");
    }
    System.out.print("done.");
  }
}
