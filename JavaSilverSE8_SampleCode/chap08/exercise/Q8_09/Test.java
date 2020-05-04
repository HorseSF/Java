public class Test{
  public static void main(String[] args) {
    int[] x = {0, 1, 2, 3, 4};
    try{
      System.out.println ("x[6]: " + x[6]);
      System.out.println("x[3]: " + x[3]);
    } catch (Exception e) {
      System.out.println("ex1");
    } catch (ArrayIndexOutOfBoundsException oe) {
      System.out.println("ex2" );
    } finally {
      System.out.println("finally block");
    }
    System.out.println("x[0]: " + x[0]);
  }
}
