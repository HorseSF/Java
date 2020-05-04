import java.util.ArrayList;
interface A {}
abstract class B implements A {}
class C extends B {}
class D extends B {}
public class Test {
  public static void main(String[] args) {
    ArrayList<D> list = new ArrayList<>();
    list.add(new B());  //‡@
    list.add(new C());  //‡A
    list.add(new D());  //‡B
  }
}
