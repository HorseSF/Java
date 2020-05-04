class Sample3_9 {
  public static void main(String[] args) {
    //同じ要素数と値をもつ配列でも、別々に生成されたものなので
	int[] a1 = {10};  int[] a2 = {10};
    System.out.println("a1 == a2 : " + ( a1 == a2 ));

    //=演算子によりa4変数に代入しています、コピーされたため、結果は同一データを参照することになります
    int[] a3 = {10};  int[] a4 = a3;
    System.out.println("a3 == a4 : " + ( a3 == a4 ));
  }
}
