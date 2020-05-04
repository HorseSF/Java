class Sample3_5 {
  public static void main(String[] args) {
    int a = 10; int b = 10; int c = 10; int d = 10;
    
    //＆以後評価する
    boolean result1 = a++ > 10 & ++b > 10;
    System.out.println(
           "result1:" + result1 + " a:" + a  + " b:" + b);
    
    //＆以後評価しない
    boolean result2 = c++ > 10 && ++d > 10;
    System.out.println(
            "result2:" + result2 + " c:" + c  + " d:" + d);
    
    a=b=c=d=11;
    boolean result3 = a++>10 | b++>10;
    System.out.println("result3:" + result3 + " a:" + a  + " b:" + b);
    
    a=b=c=d=11;
    boolean result4 = a++>10 || b++>10;
    System.out.println("result4:" + result4 + " a:" + a  + " b:" + b);
    
  }
}
