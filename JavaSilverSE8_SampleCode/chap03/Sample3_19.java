class Sample3_19 {
  public static void main(String[] args) {
    int num = 2;
    switch (num) {
      case 1:    // num�̒l��1�̏ꍇ�̏���
        System.out.println("num�̒l��1�ł��B");  
        break;   // break�ɂ��switch���甲����
      case 2:    // num�̒l��2�̏ꍇ�̏���
        System.out.println("num�̒l��2�ł��B");  
        // break�����Ȃ����߁A����default�̏����������s
      default:   // num�̒l��1�ȊO�̏ꍇ�̈ȉ������s�����                                    
        System.out.println("default�ł��B");  
    }
  }
}
