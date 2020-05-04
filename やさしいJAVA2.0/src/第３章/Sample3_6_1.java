package 第３章;

import java.io.*;

public class Sample3_6_1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("文字列を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(str + "が入力されました。");
	}

}
