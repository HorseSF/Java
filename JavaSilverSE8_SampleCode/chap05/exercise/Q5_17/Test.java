public class Test {
  private String s;
  private void funcX(String a) { s = a; }
  public void funcY() {
    String s = new String();
    funcX(s);
    s = new String();
    funcX(null);
    s = null;
  }
}
