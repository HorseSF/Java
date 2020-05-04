class Sample5_7 {
  public static void main(String[] args) {
    //System.out.println(Sample5_6.instanceVal);   //‡@ NG
    System.out.println(Sample5_6.staticVal);       //‡A OK
    //Sample5_6.methodA();                         //‡B NG
    Sample5_6.methodB();                           //‡C OK
    System.out.println("-------------------");
    Sample5_6 obj = new Sample5_6();
    System.out.println(obj.instanceVal);           //‡D OK
    System.out.println(obj.staticVal);             //‡E OK
    obj.methodA();                                 //‡F OK
    obj.methodB();                                 //‡G OK
  }
}
