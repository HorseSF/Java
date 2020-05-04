package 第5章;
/*
キーボードから整数を入力させ、場合に応じて次のようなメッセージを出力するコードを記述してください。
値が偶数だった場合ーーーー＞「xxxは偶数です。」
値が奇数だった場合ーーーー＞「xxxは奇数です。」
（ただしxxxは入力した整数）
整数を入力してください。
１
1は奇数です。
*/

import java.io.*;
public class SampleP2 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を入力してください。");
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		if((res % 2) == 0)
			System.out.println(res + "は偶数です。");
		else
			System.out.println(res + "は奇数です。");
	}

}
