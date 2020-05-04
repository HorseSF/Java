class Sample3_7 {
  public static void main(String[] args) {
	  
	//引数指定された文字列を現在の文字列に追加する  
    StringBuilder sb1 = new StringBuilder("Ab Cdefge");
      System.out.println("append()   : " + sb1.append("XYZ"));
    
    //引数指定された文字列を、引数で指定された位置にある文字の前に挿入する
    //012345678
    //Ab Cdefge  
    StringBuilder sb2 = new StringBuilder("Ab Cdefge");
      System.out.println("insert()   : " + sb2.insert(2,"ZZ"));
    
    //逆の並び順の文字列に置換する  
    StringBuilder sb3 = new StringBuilder("Ab Cdefge");
      System.out.println("reverse()  : " + sb3.reverse());
    
    //引数で指定された位置の文字を引数で指定した文字に置き換える
    StringBuilder sb4 = new StringBuilder("Ab Cdefge");
      sb4.setCharAt(3,'Z');
      System.out.println("setCharAt(): " + sb4);
      
    //start位置からend位置の1つ前までの位置にある文字を全て削除する  
    //StringBuilder delete(int start,intend)
    StringBuilder sb5 = new StringBuilder("Ab Cdefge");
      System.out.println("delete()   : " + sb5.delete(0,5));
      
    //start位置からend位置の1つ前までの位置にある文字を、引数で指定された文字列を置換する
    //StringBuilder repalce(int start,int end,String str)  
    StringBuilder sb6 = new StringBuilder("Ab Cdefge");
      System.out.println("replace()  : " +
                             sb6.replace(3,sb6.length(),"YYY"));
    
    //Start位置からend位置の1つ前までの部分文字列を返す
    //String substring(int start,int end)
    StringBuilder sb7 = new StringBuilder("Ab Cdefge");
      System.out.println("substring(): " + sb7.substring(5,7));
      
    //引数で指定した位置から最後までの部分文字列を返す  
    StringBuilder sb8 = new StringBuilder("Ab Cdefge");
      System.out.println("substring(): " + sb8.substring(5));
  }
}
