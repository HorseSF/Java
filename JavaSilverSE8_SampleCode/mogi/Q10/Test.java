import java.util.ArrayList;
public class Test {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("A"); list.add("B");list.add("C");
    list.add(0, "D");
    System.out.println(list);
  }
}
