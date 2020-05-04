public class Test {
  public static void main(String[] args) {
    Boolean[] bl = new Boolean[2];
    bl[0] = new Boolean(Boolean.parseBoolean("true"));
    bl[1] = null;
    System.out.print(bl[0] + " " + bl[1]);
  }
}
