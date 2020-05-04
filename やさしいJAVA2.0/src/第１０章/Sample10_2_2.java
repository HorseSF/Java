package 第１０章;

import java.io.*;

public class Sample10_2_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("英字を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		String strU = str.toUpperCase();
		String strL = str.toLowerCase();
		
		System.out.println("大文字に変換すると" + strU + "です。");
		System.out.println("小文字に変換すると" + strL + "です。");
	}

}
