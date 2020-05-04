public class Test {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    System.arraycopy(array, 2, array, 1, 2);
    System.out.println(array[2] + " " + array[4]);
  }
}
