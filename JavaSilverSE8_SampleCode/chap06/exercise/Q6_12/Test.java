abstract class AbsSuper {
  public abstract void disp();
}
class Sub extends AbsSuper {
  void disp() { System.out.print("Super"); }
}
public class Test extends Sub {
  public void disp() { System.out.print("Sub"); }
  public static void main(String[] args) {
    new Test().disp();
  }
}
