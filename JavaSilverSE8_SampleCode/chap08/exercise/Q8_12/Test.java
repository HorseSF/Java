public class Test {
  private short s;
  private Integer   i;
  public Test(int i) {
    this.i = this.i + i + s;
    this.s = 0;
  }
  public void print() { System.out.println(" s = " + s + " : i = " + i); }
  public static void main(String[] args) {
    Test t = new Test(5);
    t.print();
  }
}
