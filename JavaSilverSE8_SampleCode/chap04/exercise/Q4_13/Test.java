public class Test {
  public static void main(String[] args) {
    String[] ary = {"xx", "yy"};
    for(int i = 0; i < ary.length; i++) {
      int a = 0;
      if(a < 1){
        while(a < ary.length) {
          System.out.print(ary[a] + " ");
          a++;
        }
      }
    }
  }
}
