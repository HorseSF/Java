public class Test {
  public static void main(String[] args) {
    int[] ary = {10, 20, 30};
    int count = 0;
    do{
      System.out.print(ary[count] + " ");
      count++;
    }while(count < ary.length -1);
  }
}
