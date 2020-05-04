class Sample3_14 {
  public static void main(String[] args) {
    int num = 5;
    if (num < 10) {
      System.out.println("num�̒l��10�����ł��B");
    }
    num = 20;
    if (num >= 100)
      System.out.println("num�̒l��100�ȏ�ł��B");
    System.out.println("2�߂�if���̌�̏���");
    
    System.out.println("-----------------");
    
    int test = 1;
    
    if(test != 1)
    	System.out.println("test==" + test);
    	System.out.println("後処理１");
    System.out.println("後処理２");
    
  }
}
