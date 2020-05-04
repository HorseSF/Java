public class Test {
  public static void main(String[] args) {
    String[][] ary = {{"a"}, {"b", "c", "d"}};
    for(int i = 0; i < ary.length; i++) {
      for(int j = 0; j < ary[i].length; j++) {
        System.out.print(ary[i][j] + " ");
      }
      System.out.println();
    }
  }
}
