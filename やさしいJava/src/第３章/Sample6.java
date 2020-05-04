package 第３章;

import java.io.*;

public class Sample6 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を２つ入力してください。");
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		System.out.println("最初に" + num1 + "が入力されました。");
		System.out.println("次に" + num2 + "が入力されました。");
	}
}
