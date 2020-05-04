class Sample3_13 {
  public static void main(String[] args) {
    String str1 = null;
    String str2 = "";
    int[] array1 = null;
    int[] array2 = new int[1];
    System.out.println(str1 == null);
    
    //空文字が代入されていため
    System.out.println(str2 == null);
    System.out.println(array1 != null);
    System.out.println(array2 != null);
  }
}
