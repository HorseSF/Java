class Sample4_3 {
  public static void main(String[] args) {
    int num = 0;

    do {      // 繰り返し処理の実行
      System.out.println("num の値は " + num + " です。");
      num++;  // num の値に 1 加算
    } while (num < 5);  // 条件判定 num が 5 未満かどうか
  }
}
