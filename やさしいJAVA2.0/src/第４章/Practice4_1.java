package 第４章;

import java.io.*;

public class Practice4_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		int inum = Integer.parseInt(str1);
		inum *= inum;
		
		System.out.println("正型型の面積は" + inum + "です");
	}

}
