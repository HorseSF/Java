public class Test {
  public static void main(String[] args) {
    int[] ary = {77, 88, 99};
    int count = 2;
    do{
      System.out.print(ary[count] + " ");
      --count;
    }while(count < ary.length);
  }
}
