class Sample3_20 {
  public static void main(String[] args) {
    int num = 3;
    switch (num) {
      case 1:
      case 2:
        // num値が1か2の場合、実行される
        System.out.println("1 または 2 ");  
        break;
      case 3:
      case 4:
        // num値が3か4の場合、実行される
        System.out.println("3 または 4 ");  
        break;
      default:  
        // num値が1から4以外の場合、実行される
        System.out.println("default");
    }
  }
}
