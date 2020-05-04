package 第３章;

import java.io.*;

public class Practic_3_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("文字列を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			System.out.println("'"+c+"'" + "の文字コードは" + (int)c + "です。");			
		}		
	}
}
