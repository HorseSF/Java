class Sample3_6 {
  public static void main(String[] args) {
    String s = "abcdefa";
    System.out.println("charAt()      : " + s.charAt(2));
    System.out.println("endsWith()    : " + s.endsWith("fa"));
    System.out.println("indexOf()     : " + s.indexOf('c'));
    System.out.println("replace()     : " + s.replace('a','z'));
    System.out.println("substring()   : " + s.substring(2));
    System.out.println("toUpperCase() : " + s.toUpperCase());
    
    System.out.println("--------------");
    
    //   0123456
    //   ↓↓↓↓↓↓↓
    s = "abcdefa";
    
    //2番目文字を返す　０から
    System.out.println("char charAt(int i):" + s.charAt(2));
    
    //指定された文字列を後ろに連結する
    System.out.println("String concat(String str):" + s.concat("AAA"));
    
    //指定された文字列で終わっていれば、trueを返す
    System.out.println("boolean endsWith(String suffix):" + s.endsWith("ef"));
    
    //他の文字列を比較する　大文字、小文字は区別しない
    System.out.println("boolean equalslgnoreCase(String str):"
    					+ s.equalsIgnoreCase("ABCDEFA"));
    
    //最初に出現数する位置を返す　０から
    System.out.println("int indexOf(char ch):" + s.indexOf("a"));
    
    //最後に出現する位置を返す
    System.out.println("int lastindexOf(char ch):" + s.lastIndexOf("a"));
    
    //文字列の文字数を返す
    System.out.println("int length():" + s.length());
    
    //文字列中にある０文字を、n文字に置き換えた結果の文字列を返す
    System.out.println("String replace(char o,char n):" + s.replace("a", "p"));
    
    //指定された文字列で初めっていれば、trueを返す
    System.out.println("boolean stratsWith(String suffix):" + s.startsWith("ab"));
    
    //指定した位置から最後までの文字列を返す
    System.out.println("String substring(int i):" + s.substring(3));
    
    //start位置からend位置の1つ前までの部分文字列を返す
    System.out.println("String substring(int start,int end):" + s.substring(2, 5));
    
    //小文字に変換
    System.out.println("String toLowerCase():" + s.toLowerCase());
    
    //大文字に変換
    System.out.println("String toUpperCase():" + s.toUpperCase());
    
    //プロジェクトが保持する文字列を返す
    System.out.println("String toString():" + s.toString());
    
    //空白を削除
    System.out.println("String trim():" + s.trim());
    

  }
}
