public class Test {
  public static void main(String[] args) {
    int[][] ary = new int[4][2];
    ary[0] = new int[]{10, 20, 30, 40};
    ary[1] = new int[]{50, 60};
    for(int[] xx : ary) {
      for(int yy : xx) {
        System.out.print(yy + " ");
      }
      System.out.println();
    }
  }
}
