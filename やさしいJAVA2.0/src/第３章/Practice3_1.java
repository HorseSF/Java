package 第３章;

import java.io.*;

public class Practice3_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("あなたは何歳です？");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		System.out.println("あなたは" + num +"歳です。");
		
	}

}
