public class Test {
  public static void main(String[] args) {
    int[] ary = { 9, 6, 2, 5, 3};
    ary[2] = ary[4];
    ary[4] = 7;
    for(int a : ary) System.out.print(a);
  }
}
