class Sample3_11 {
  public static void main(String[] args) {
    String s1 = new String("tanaka");  
    String s2 = new String("tanaka");  
    System.out.println("s1 == s2   : " + ( s1 == s2 ));

    String s3 = "tanaka";  
    String s4 = "tanaka";    
    System.out.println("s3 == s4   : " + ( s3 == s4 ));
    
    /* ==演算子は参照先が同じ時にtrueが返るため、
     * たとえ文字列自体が同じであっても、
     * 参照先が異なればfalseとなります。
     * したがって、String型による文字列の比較において、
     * 保持する内容が同じかどうかの比較は、
     * equals()メソッドを使用しましょう。
     */
  }
}
