package 第６章;

import java.io.*;

public class Practic6_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("テストの点数を入力してください。（０で終了）");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inum =0;
		int sum = 0;
		
		do{
			String str = br.readLine();
			inum = Integer.parseInt(str);
			sum += inum;
		}while(inum != 0);
		
		System.out.println("テストの合計は" + sum + "点です。");
	}

}
