class Sample7_4 {
  public static void main(String[] args) {
    //StringBuilder sb1 = "tanaka";  //コンパイルエラー
    StringBuilder sb2 = new StringBuilder("tanaka");
    StringBuilder sb3 = new StringBuilder("tanaka");
    System.out.println("sb2 == sb3      : " + (sb2 == sb3 ));
    System.out.println("sb2.equals(sb3) : " + (sb2.equals(sb3)));
    System.out.println("sb2.toString().equals(sb3.toString()) : " +
                       (sb2.toString().equals(sb3.toString())));
  }
}
