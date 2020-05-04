public class Test {
  public static void main(String[] args) {
    int[] ary = { 91, 92, 93, 94, 95, 96};
    for(int i : ary) {
      System.out.print(i + " ");
      if(i == 92) { 
        System.out.print("con ");
        continue;
      }
      System.out.print("break ");
      break;
    }
  }
}
