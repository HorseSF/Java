public class Test {
  public static void main(String[] args) {
    int[] ary1 = {10, 20, 30, 40};
    int[] ary2 = new int[2];
    ary2 = ary1;
    for(int val : ary2) { System.out.print(val + " "); }
  }
}
