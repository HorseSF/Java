class Sample3_18 {
  public static void main(String[] args) {
    int a = 10;
    if (a > 0) {
      System.out.println("a�͐��̒l�ł��B");
      if(a % 2 == 0) {
        System.out.println("a�͋����ł��B");
      }
    } else {
      if(a == 0) {
        System.out.println("a��0�ł��B");
      } else {
        System.out.println("a�͕��̒l�ł��B");
      }
    }
  }
}
