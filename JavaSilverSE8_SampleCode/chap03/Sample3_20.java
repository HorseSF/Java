class Sample3_20 {
  public static void main(String[] args) {
    int num = 3;
    switch (num) {
      case 1:
      case 2:
        // num�l��1��2�̏ꍇ�A���s�����
        System.out.println("1 �܂��� 2 ");  
        break;
      case 3:
      case 4:
        // num�l��3��4�̏ꍇ�A���s�����
        System.out.println("3 �܂��� 4 ");  
        break;
      default:  
        // num�l��1����4�ȊO�̏ꍇ�A���s�����
        System.out.println("default");
    }
  }
}
