class Test {
  String myPrint(int a, String b){ return "test"; }     //‡@
  String myPrint(int a, int b){ return "test"; }        //‡A
  String myPrint(String a, int b){ return "test"; }     //‡B
  //void myPrint(int a, String b){ }                    //‡C
  //String myPrint(int x, String y){ return "test"; }   //‡D
}
