package 第２章;

import java.io.*;

public class Practic_2_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("台形面積を計算する。");
		System.out.println("上底を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		
		System.out.println("下底を入力してください。");
		String str2 = br.readLine();
		
		System.out.println("高を入力してください。");
		String str3 = br.readLine();
		
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		int h = Integer.parseInt(str3);
		
		System.out.printf("台形の面積は%dです。%n",(a+b)*h/2);
	}

}
