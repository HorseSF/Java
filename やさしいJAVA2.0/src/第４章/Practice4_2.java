package 第４章;

import java.io.*;

public class Practice4_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("三角形の高さと底辺を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int s = num1*num2/2;
		
		System.out.println("三角形の面積は" + s + "です。");

	}

}
