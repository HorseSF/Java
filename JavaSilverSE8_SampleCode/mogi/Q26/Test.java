public class Test {
  public static void main(String[] args) {
    String[] ary = { "B", "A", "C" };
    int y = 0;
    for(String s : ary) {
      switch(s) {
      case "A":
        y -= 1;
        break;
      case "B":
        y += 2;
        break;
      case "C":
        y += 2;
      }
    }
    System.out.println(y);
  }
}
