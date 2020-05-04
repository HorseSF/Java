public class Test {
  public static void main(String[] args) {
    String[][] ary = {{"a", "b"},
                      {"c", "d", null, null, null}};
    for(int x = 0; x < ary.length; x++ ) {
      for(int y = 0; y < ary.length; y++ ) {
        System.out.print(ary[x][y] + " ");
      }
    }
  }
}
