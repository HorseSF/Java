package 第１０章;

import java.io.*;

public class Sample10_2_4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("文字列を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		
		System.out.println("追加する文字列を入力してください。");
		String str2 = br.readLine();
		
		StringBuffer sb = new StringBuffer(str1);
		sb.append(str2);
		
		System.out.println(str1 + "に" + str2 + "を追加すると" + sb + "です。");
	}

}

/* StringBufferクラスの主なメソッド
 * StringBuffer append(char c) → 引数の文字を追加する
 * StringBuffer append(String str) → 引数の文字列を追加する
 * StringBuffer deleteCharAt(int index) → 引数の位置の文字を削除する
 * StringBuffer insert(int offset,char c) → 引数の位置に文字を追加する
 * StringBuffer insert(int offset,String str) → 引数の位置に文字列を追加する
 * int length() → 文字列を返す
 * StringBuffer replace(int start,int end,String str) → 引数の位置の文字列を引数の文字列で置換する
 * StringBuffer reverse() → 文字順を逆にする
 * void setCharAt(int index,chat ch) → 引数の位置の文字を引数の文字にする
 * String toString() → Stringクラスのオブジェクトに変換する
 */
