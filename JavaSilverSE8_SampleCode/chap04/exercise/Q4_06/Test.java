public class Test {
  public static void main(String[] args) {
    String[] ary = {"x", "y","z"};
    int i = 1;
    for(String str : ary) {
      System.out.print("[" + i + "]");
      i++;
      switch(str) {
        case "x":
          System.out.print("x ");
        case "y":
          System.out.print("y ");
          break;
        case "a":
          System.out.print("a ");
      }
    }
  }
}
