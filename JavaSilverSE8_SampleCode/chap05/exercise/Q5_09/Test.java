public class Test {
  public void message (int i) {
    public int j= i;
    System.out.println("Value of j: " + j);
  }
  public static void main(String[] args) {
    MyClass ma = new MyClass();
    ma.message(15);
  }
}
