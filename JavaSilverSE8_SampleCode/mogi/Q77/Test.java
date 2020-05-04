import java.util.*;
public class Test {
  public static void main(String[] args) {
    try {
      ArrayList<String> list = new ArrayList<>();
      while(true) {
        list.add("a");
      }
    } catch(RuntimeException ex1) {
        System.out.print("RuntimeException ");
    } catch(Exception ex2) {
        System.out.print("Exception ");
    } 
    System.out.println("done");
  }
}
