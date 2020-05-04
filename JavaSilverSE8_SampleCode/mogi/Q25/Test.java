public class Test {
  public static void main(String[] args) {
    int[] ary = {5012, 5014, 5013, 5015, 5014};
    int num = 0;
    for(int val : ary) {
      if(val != 5014) {
        num++;
        continue;
      }
    }
    System.out.println(num);
  }
}
