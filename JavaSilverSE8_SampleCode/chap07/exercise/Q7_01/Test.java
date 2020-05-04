public class Test {
  public static void main(String[] args) {
    int[][] ary = {{1, 2, 3}, {4, 5, 6, 7}};
    System.out.print(ary[0].length);
    System.out.print(ary.getClass().isArray());
    System.out.print(ary[1][2]);
  }
}
