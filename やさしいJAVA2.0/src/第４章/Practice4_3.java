package 第４章;

import java.io.*;

public class Practice4_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("科目１〜５の点数を入力してください");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		String str4 = br.readLine();
		String str5 = br.readLine();
		
		int sum = 0;
		sum += Integer.parseInt(str1);
		sum += Integer.parseInt(str2);
		sum += Integer.parseInt(str3);
		sum += Integer.parseInt(str4);
		sum += Integer.parseInt(str5);
		
		double d = 0;
		d = (double)sum/5;
		
		System.out.println("５科目の合計点は" + sum + "です。");
		System.out.println("５科目の平均点は" + d + "です。");
		
	}

}
