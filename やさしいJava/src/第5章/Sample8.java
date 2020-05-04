package 第5章;

import java.io.*;

public class Sample8 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("何番目のコースにしますか？");
		System.out.println("整数を入力してください。");
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		char ans = (res == 1) ? 'A' : 'B';
		//条件 ? trueの時の式1 : falseの時の式2
		//char ans;
		//if(res == 1)
		//  ans = 'A'
		//else
		//  ans = 'B'
		System.out.println(ans + "コースを選択しました。");
	}
}
