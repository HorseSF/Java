class Sample4_7 {
  public static void main(String[] args) {
    // 配列の宣言
    char[] array = { 'a', 'b', 'c', 'd', 'e' };
    // 配列arrayの全要素を順番に取り出し、出力する
    for (char c : array) {  // 拡張for文で処理する場合
      System.out.print(c + " ");
    }
    System.out.println(); //改行
    // for文で処理する場合
    for (int count = 0; count < array.length ; count++) {
      System.out.print(array[count] + " ");
    }
  }
}
