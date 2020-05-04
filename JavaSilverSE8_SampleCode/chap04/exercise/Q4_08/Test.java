public class Test {
  public static void main(String[] args) {
    String[] ary = {"a", "b", "c"};
    for(String s : ary) {
      int i = 0;
      while(i < ary.length) {
        i++;
        System.out.print(i + " ");
      }
    }
  }
}
