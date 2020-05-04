package 第１０章;

public class Sample10_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		
		int len = str.length();
		
		System.out.println(str + "の１番目の文字は" + ch1 + "です。");
		System.out.println(str + "の２番目の文字は" + ch2 + "です。");
		System.out.println(str + "の長さは" + len + "です。");
	}

}

/* Stringクラスの主なメソッド
 * char charAt(int index) →　引数の位置にある文字を返す
 * boolean endsWith(String suffix) →　引数の文字列で終わるかどうかを判断する
 * boolean equals(Object anObject) →　引数の文字列かどうかを判断する
 * boolean equalslgnoreCase(String anotherString) →　引数の文字列かどうかを大文字・小文字の区別なしに判断する
 * int indexOf(int ch) →　引数の文字が最初に出現する位置を返す
 * int indexOf(String str) →　引数の文字列が最初に出現する位置を返す
 * int lastdexOf(int ch) →　引数の文字が最後に出現する位置を返す
 * int lastIndexOf(String str) →　引数の文字列が最後に出現する位置を返す
 * int length() →　文字列の長さを返す
 * String substring(int beginIndex) →　引数の位置から最後までの部分文字列が返す
 * String substring(int beginIndex,int endIndex) →　引数の開始位置から最後位置までの部分文字列を返す
 * boolean startsWith(String prefix) →　引数の文字列で始めるかどうかを判断する
 * String toLowerCase() →　文字列を小文字に変換した結果を返す
 * String toUpperCase() →　文字列を大文字に変換した結果を返す
 */
