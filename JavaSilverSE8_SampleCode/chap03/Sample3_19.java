class Sample3_19 {
  public static void main(String[] args) {
    int num = 2;
    switch (num) {
      case 1:    // numの値が1の場合の処理
        System.out.println("numの値は1です。");  
        break;   // breakによりswitchから抜ける
      case 2:    // numの値が2の場合の処理
        System.out.println("numの値は2です。");  
        // break文がないため、次のdefaultの処理文も実行
      default:   // numの値が1以外の場合の以下が実行される                                    
        System.out.println("defaultです。");  
    }
  }
}
