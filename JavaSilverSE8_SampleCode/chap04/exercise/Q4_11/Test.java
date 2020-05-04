public class Test {
  public static void main(String[] args) {
    String[] ary = {"10", "20", "30", "40"};
    for (String str : ary) {
      if(str.equals("20")) {
        continue;
      }
      System.out.print(str + " ");
      if(str.equals("30")) {
        break;
      }
    }
  }
}
