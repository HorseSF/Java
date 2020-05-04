package Chapter_001;

/**
 * 
 * @author xiaofeima
 *
 */

/*
 * ソースファイル内には、一つ以上のclass（クラス）宣言が必要になります。
 */
public class Java_SilverSE8_C001_S001 {
	
/*
 * main()メソッド
 * main()メソッドはJavaアプリケーションの特別なメソッドで、記述は必ず
 * public static void main(String[] args){...}となります
 * ただし、（String[] args）の部分は(String args[])としても問題ありません。
 * main()メソッドはプログラムの実行開始位置を表し、数千行のプログラムであっても、
 * 必ずmain()メソッドから実行されます。
 * なお、メソッドとは、あるロジックを使用して、データ処理を実行するブロック
 * （中カッコ{}で囲まれた処理文のかたまり）のことです。	
 */
	public static void main(String[] args){
		
/*
 * printlnは出力(print)、行(line)という意味があります。
 * つまりprintlnを使用すると、情報の出力後に改行コードが追加されます。
 * また、printという記述も可能です。printを使用すると、情報の出力後に改行は行われません。
 */
		
/*
 * 文
 * 文は、プログラムの最小構成単位で、一つの処理を記述したものです。文の最後には、「;」セミコロンを記述します。
 */
		
/*
 * ブロック
 * ブロックは、文の並びを{}で囲んで一つにまとめたものです。
 * 単一の文がかける場合ならどこでもブロックが書けます。
 * メソッド本体も{}で囲んだブロックが使用されます。
 */
		System.out.println("Hello");
	}
}
