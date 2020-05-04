import java.util.*;
public class Test {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>(10);
    list.add(0); list.add(1); list.add(2);
    System.out.println(list.get(list.size()));
  }
}
