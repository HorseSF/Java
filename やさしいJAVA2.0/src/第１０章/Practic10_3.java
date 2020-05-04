package 第１０章;

import java.io.*;

public class Practic10_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("整数を２つ入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int ans = Math.min(num1, num2);
		
		System.out.println(str1 + "と" + str2 + "のうち小さいほうは" + ans + "です。");
	}

}
