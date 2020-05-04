package 第４章;

import java.io.*;

public class Sample4_2_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("整数を３つ入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		
		int sum = 0;
		
		sum += Integer.parseInt(str1);
		sum += Integer.parseInt(str2);
		sum += Integer.parseInt(str3);
		
		System.out.println("３つの整数の合計は" + sum + "です。");
	}

}
